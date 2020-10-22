package com.mparticle.client;

import com.google.gson.Gson;
import com.mparticle.ApiClient;
import com.mparticle.model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;

import java.math.BigDecimal;
import java.util.*;

/**
 * API tests for EventsApi
 */
public class EventsApiTest {

    private EventsApi api;
    // If you're like to actually test an upload,
    // replace with a key and secret
    private boolean integrationTest = false;

    @Before
    public void setup() {
        api = new ApiClient("foo-key", "foo-secret")
                .createService(EventsApi.class);
    }


    @Test
    public void uploadUserIdentitiesAndAttributes() throws Exception {
        List<Batch> bulk = new ArrayList<>();
        Batch batch = new Batch();

        batch.environment(Batch.Environment.DEVELOPMENT);
        batch.userIdentities(new UserIdentities()
                .customerId("1234")
                .email("example@foo.com")
                .phoneNumber2("5515-123-4567")
                .phoneNumber3("5155-123-4567")
        );


        Map<String, Object> userAttributes = new HashMap<>();
        userAttributes.put("foo", "bar");
        userAttributes.put("foo-array", new String[]{"bar1", "bar2"});
        userAttributes.put("foo-array-2", Arrays.asList("bar3","bar4"));
        batch.userAttributes(userAttributes);
        batch.deviceInfo(
                new DeviceInformation()
                        .iosAdvertisingId("5864e6b0-0d46-4667-a463-21d9493b6c10")
        );
        bulk.add(batch);
        Gson gson = new Gson();
        String json = gson.toJson(batch);
        Batch newBatch = gson.fromJson(json, Batch.class);
        Assert.assertEquals(0, newBatch.getEvents().size());

        if (integrationTest) {
            Call<Void> result = api.bulkUploadEvents(bulk);
            Response<Void> response = result.execute();
            Assert.assertEquals(202, response.code());

            result = api.uploadEvents(batch);
            response = result.execute();
            Assert.assertEquals(202, response.code());
        }
    }

    @Test
    public void uploadCustomEventTest() throws Exception {
        List<Batch> bulk = new ArrayList<>();
        Batch batch = new Batch();
        batch.environment(Batch.Environment.DEVELOPMENT);
        Map customAttributes = new HashMap<>();
        customAttributes.put("foo", "bar");
        CustomEvent event = new CustomEvent().data(
                new CustomEventData()
                        .eventName("foo event")
                        .customEventType(CustomEventData.CustomEventType.LOCATION)
        );
        event.getData().customAttributes(customAttributes);
        batch.addEventsItem(event);
        bulk.add(batch);

        Call<Void> bulkResult = api.bulkUploadEvents(bulk);
        Response<Void> bulkResponse = bulkResult.execute();


        Call<Void> singleResult = api.uploadEvents(batch);
        Response<Void> singleResponse = singleResult.execute();

    }

    @Test
    public void uploadScreenEventTest() throws Exception {
        List<Batch> bulk = new ArrayList<>();
        Batch batch = new Batch();

        Context context = new Context();
        DataPlanContext dpContext = new DataPlanContext();
        dpContext.planId("mobile_data_plan");
        dpContext.planVersion(2);
        context.dataPlan(dpContext);
        batch.context(context);
        batch.userIdentities(new UserIdentities()
                .customerId("1234lololol")
                .email("example@foo.com")
                .phoneNumber2("5515-123-4567")
                .phoneNumber3("5155-123-4567")

        );

        batch.environment(Batch.Environment.DEVELOPMENT);
        ScreenViewEvent event = new ScreenViewEvent().data(
                new ScreenViewEventData()
                        .screenName("foo screen")
        );
        batch.addEventsItem(event);
        bulk.add(batch);
        Gson gson = new Gson();
        String json = gson.toJson(batch);
        Batch newBatch = gson.fromJson(json, Batch.class);
        Assert.assertEquals(1, newBatch.getEvents().size());

        if (integrationTest) {
            Call<Void> result = api.bulkUploadEvents(bulk);
            Response<Void> response = result.execute();
            Assert.assertEquals(202, response.code());

            result = api.uploadEvents(batch);
            response = result.execute();
            Assert.assertEquals(202, response.code());
        }
    }

    @Test
    public void uploadPurchaseEvent() throws Exception {
        List<Batch> bulk = new ArrayList<>();
        Batch batch = new Batch();
        batch.environment(Batch.Environment.DEVELOPMENT);
        batch.userIdentities(new UserIdentities()
                .customerId("1234")
                .email("example@foo.com")
                .mobileNumber("123-456-7891")
                .phoneNumber2("5515-123-4567")
                .phoneNumber3("5155-123-4567")
        );

        Product product = new Product().totalProductAmount(
                new BigDecimal("123.12"))
                .id("product-id")
                .name("product-name");
        ProductAction action = new ProductAction()
                .action(ProductAction.Action.PURCHASE)
                .totalAmount(new BigDecimal("123.12"))
                .transactionId("foo-transaction-id")
                .products(Arrays.asList(product));
        CommerceEvent event = new CommerceEvent().data(
                new CommerceEventData()
                        .productAction(action)
        );
        batch.addEventsItem(event);
        bulk.add(batch);
        Gson gson = new Gson();
        String json = gson.toJson(batch);
        Batch newBatch = gson.fromJson(json, Batch.class);
        Assert.assertEquals(1, newBatch.getEvents().size());

        if (integrationTest) {
            Call<Void> result = api.bulkUploadEvents(bulk);
            Response<Void> response = result.execute();
            Assert.assertEquals(202, response.code());

            result = api.uploadEvents(batch);
            response = result.execute();
            Assert.assertEquals(202, response.code());
        }
    }
}
