<img src="https://static.mparticle.com/sdk/mp_logo_black.svg" width="280">

## Java Server Events SDK

[![Maven Central Status](https://maven-badges.herokuapp.com/maven-central/com.mparticle/server-events-sdk/badge.svg?style=flat-square)](https://search.maven.org/#search%7Cga%7C1%7Cmparticle)

This is the mParticle Java SDK for the server-based Events API - use it to send your data to the [mParticle platform](https://www.mparticle.com/) and off to 250+ integrations! The SDK is designed to be use in a variety of environments. It provides a [Retrofit](https://square.github.io/retrofit/) interface as well as serializable models if you prefer to handle HTTP transport on your own.

> This SDK is designed only to be used in a server-side environment. If you're looking for our Android SDK - [please see here](https://github.com/mparticle/mparticle-android-sdk).


### Requirements.

Java 1.7 and later.

## Getting Started 

### Add the Dependency

The SDK is available via Maven Central.

#### Gradle

```groovy
implementation 'com.mparticle:server-events-sdk:2.5.1'
```

#### Maven

```xml
<dependency>
  <groupId>com.mparticle</groupId>
  <artifactId>server-events-sdk</artifactId>
  <version>2.5.1</version>
</dependency>
```

#### Local Maven

You can also install it locally and use it from a local Maven repository:

```sh
./gradlew uploadArchives
```

## Create a `Batch`

All data that passes through mParticle does so in the form of a "batch." A batch describes identities, attributes, events, and other information related to a *single user*. This SDK lets you upload either single batches or multiple batches at a time.

The full schema of a batch is documented in the [mParticle Events API overview](https://docs.mparticle.com/developers/server/http/). The models in this SDK directly match the JSON referenced in the overview.

```java
Batch batch = new Batch();
batch.environment(Batch.Environment.DEVELOPMENT);

// Set a Data Plan
Context context = new Context();
DataPlanContext dpContext = new DataPlanContext();
dpContext.planId("mobile_data_plan");
dpContext.planVersion(2);
context.dataPlan(dpContext);
batch.context(context);

// Set user identities
batch.userIdentities(
        new UserIdentities()
                .customerId("1234")
                .email("example@foo.com")
);

// Set device identities
batch.deviceInfo(
        new DeviceInformation()
                .iosAdvertisingId("5864e6b0-0d46-4667-a463-21d9493b6c10")
);

// Set user attributes
Map<String, Object> userAttributes = new HashMap<>();
userAttributes.put("foo", "bar");
userAttributes.put("foo-array", new String[]{"bar1", "bar2"});
userAttributes.put("foo-array-2", Arrays.asList("bar3","bar4"));
batch.userAttributes(userAttributes);

```

> It's critical to include either user or device identities with your server-side data

## Create Events

All mParticle events have a similar structure:

- `event_type`: this is the type of event, such as `custom_event` and `commerce_event`
- `data`: this contains common properties of all events, as well as properties specific to each `event_type`

The following are common properties that all events share, as represented by the `CommonEventData` class:

```javascript
{
	"data" :
	{
		"event_id" : 6004677780660780000,
		"source_message_id" : "e8335d31-2031-4bff-afec-17ffc1784697",
		"session_id" : 4957918240501247982,
		"session_uuid" : "91b86d0c-86cb-4124-a8b2-edee107de454",
		"timestamp_unixtime_ms" : 1402521613976,
		"location" : {},
		"device_current_state" : {},
		"custom_attributes": {},
		"custom_flags": {}
	},
	"event_type" : "custom_event"
}

```

The Java Server Events SDK represents this structure via an event and an event-data class for each unique event type. For example, `CustomEvent` which can be populated by a `CustomEventData` instance.

### Custom Events

```java
Map customAttributes = new HashMap<>();
customAttributes.put("foo", "bar");
CustomEvent event = new CustomEvent().data(
        new CustomEventData()
                .eventName("My Custom Event Name")
                .customEventType(CustomEventData.CustomEventType.LOCATION)
);
event.getData().customAttributes(customAttributes);
```

### Screen Events

```java
ScreenViewEvent event = new ScreenViewEvent().data(
        new ScreenViewEventData()
                .screenName("foo screen")
);
```

### Commerce Events

```java
Product product = new Product()
    .totalProductAmount(new BigDecimal("123.12"))
    .id("product-id")
    .name("product-name");
ProductAction action = new ProductAction()
    .action(ProductAction.Action.PURCHASE)
    .totalAmount(new BigDecimal("123.12"))
    .transactionId("foo-transaction-id")
    .products(Arrays.asList(product));
CommerceEvent event = new CommerceEvent().data(
        new CommerceEventData().productAction(action)
);
```


## Full Upload Example

### Create an `EventsApi` instance

`EventsApi` is a Retrofit-compatible interface, allowing you to use the rich feature-set of the Retrofit and OkHttp libraries, such as queueing and asynchronous requests.

Create an API instance with your mParticle workspace credentials. These credentials may be either "platform" (iOS, Android, etc) or "custom feed" keys:

```java
EventsApi api = new ApiClient("API KEY", "API-SECRET")
                .createService(EventsApi.class);
```

By default, the Java SDK will upload to the US1 Data Center URL.  If the API key you're sending to exists in an mParticle Data Center that's not US1, you can find the right URL for your hosting location on the [mParticle docs site](https://docs.mparticle.com/developers/data-localization/#events-api).  You can then override the base url using the following configuration:

```java
Retrofit.Builder mybuilder = new Retrofit.Builder().baseUrl("https://s2s.eu1.mparticle.com/v2/").build();
EventsApi api = new ApiClient("API KEY", "API-SECRET")
                .setAdapterBuilder(mybuilder)
                .createService(EventsApi.class);
```

> The mParticle Events API leverages HTTP basic authentication over TLS. 

### Perform a Synchronous Upload

The SDK supports both multi-batch ("bulk") or single-batch uploads:

```java
//assemble your Batch
Batch batch = new Batch();

batch.environment(Batch.Environment.DEVELOPMENT);
batch.userIdentities(new UserIdentities()
        .customerId("1234")
        .email("example@foo.com")
);

// Add your events
Map customAttributes = new HashMap<>();
customAttributes.put("foo", "bar");
CustomEvent customEvent = new CustomEvent().data(
        new CustomEventData()
                .eventName("foo event")
                .customEventType(CustomEventData.CustomEventType.LOCATION)
);
customEvent.getData().customAttributes(customAttributes);
batch.addEventsItem(customEvent);

ScreenViewEvent screenEvent = new ScreenViewEvent().data(
        new ScreenViewEventData()
                .screenName("foo screen")
);
batch.addEventsItem(screenEvent);

EventsApi api = new ApiClient("API KEY", "API-SECRET").createService(EventsApi.class);

// Perform a bulk upload
List<Batch> bulk = new ArrayList<>();
bulk.add(batch);
Call<Void> bulkResult = api.bulkUploadEvents(bulk);
Response<Void> bulkResponse = bulkResult.execute();

// Perform a single upload
Call<Void> singleResult = api.uploadEvents(batch);
Response<Void> singleResponse = singleResult.execute();
```

### Logging

By default, logging is ignored.  Please implement your own LogHandler to handle log statements.

```java
Logger.setLogHandler(new DefaultLogHandler());
Logger.info("Statement");
```

### License

[Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0)
