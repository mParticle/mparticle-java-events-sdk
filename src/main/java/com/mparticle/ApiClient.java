package com.mparticle;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.mparticle.client.EventsApi;
import com.mparticle.client.HttpBasicAuth;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class ApiClient {

  private Map<String, Interceptor> apiAuthorizations;
  private static OkHttpClient.Builder okBuilder;
  private Retrofit.Builder adapterBuilder;
  private JSON json;
  private static Long retryAfter = null;

  /**
   * Create an API client with your mParticle API key and secret
   *
   * @param apiKey
   * @param apiSecret
   */
  public ApiClient(String apiKey, String apiSecret) {
    apiAuthorizations = new LinkedHashMap<String, Interceptor>();
    createDefaultAdapter();
    HttpBasicAuth auth = new HttpBasicAuth();
    auth.setCredentials(apiKey, apiSecret);
    addAuthorization("basic", auth);
  }

  public void createDefaultAdapter() {
    json = new JSON();
    okBuilder = new OkHttpClient.Builder();

    String baseUrl = "https://s2s.mparticle.com/v2";
    if (!baseUrl.endsWith("/"))
      baseUrl = baseUrl + "/";

    adapterBuilder = new Retrofit
      .Builder()
      .baseUrl(baseUrl)
      .addConverterFactory(ScalarsConverterFactory.create())
      .addConverterFactory(GsonCustomConverterFactory.create(json.getGson()));
  }

  public <S> S createService(Class<S> serviceClass) {
    if (serviceClass == EventsApi.class) {
      okBuilder.addInterceptor(new RateLimitInterceptor());
    }
    return adapterBuilder
      .client(okBuilder.build())
      .build()
      .create(serviceClass);
  }

  /**
   * Helper method to configure the username/password for basic auth or password oauth
   * @param username Username
   * @param password Password
   * @return ApiClient
   */
  public ApiClient setCredentials(String username, String password) {
    for(Interceptor apiAuthorization : apiAuthorizations.values()) {
      if (apiAuthorization instanceof HttpBasicAuth) {
        HttpBasicAuth basicAuth = (HttpBasicAuth) apiAuthorization;
        basicAuth.setCredentials(username, password);
        return this;
      }
    }
    return this;
  }


  /**
   * Adds an authorization to be used by the client
   * @param authName Authentication name
   * @param authorization Authorization interceptor
   * @return ApiClient
   */
  public ApiClient addAuthorization(String authName, Interceptor authorization) {
    if (apiAuthorizations.containsKey(authName)) {
      throw new RuntimeException("auth name \"" + authName + "\" already in api authorizations");
    }
    apiAuthorizations.put(authName, authorization);
    okBuilder.addInterceptor(authorization);
    return this;
  }

  public Map<String, Interceptor> getApiAuthorizations() {
    return apiAuthorizations;
  }

  public ApiClient setApiAuthorizations(Map<String, Interceptor> apiAuthorizations) {
    this.apiAuthorizations = apiAuthorizations;
    return this;
  }

  public Retrofit.Builder getAdapterBuilder() {
    return adapterBuilder;
  }

  public ApiClient setAdapterBuilder(Retrofit.Builder adapterBuilder) {
    this.adapterBuilder = adapterBuilder;
    return this;
  }

  public OkHttpClient.Builder getOkBuilder() {
    return okBuilder;
  }

  public void addAuthsToOkBuilder(OkHttpClient.Builder okBuilder) {
    for(Interceptor apiAuthorization : apiAuthorizations.values()) {
      okBuilder.addInterceptor(apiAuthorization);
    }
  }

  /**
   * Clones the okBuilder given in parameter, adds the auth interceptors and uses it to configure the Retrofit
   * @param okClient An instance of OK HTTP client
   */
  public void configureFromOkclient(OkHttpClient okClient) {
    this.okBuilder = okClient.newBuilder();
    addAuthsToOkBuilder(this.okBuilder);
  }

  static class RateLimitInterceptor implements Interceptor {


    @Override
    public Response intercept(Chain chain) throws IOException {
      System.out.println("Starting request: " + chain.request().toString());
      if (retryAfter != null && System.currentTimeMillis() < retryAfter) {
        System.out.println("This endpoint is currently rate-limited, please retry after" + retryAfter + "ms, returning a local 429 response");
        return new Response.Builder()
                .request(chain.request())
                .addHeader("RETRY_AFTER", retryAfter.toString())
                .protocol(Protocol.HTTP_2)
                .code(429)
                .message("")
                .body(ResponseBody.create(null, ""))
                .build();
      }

      Response response = chain.proceed(chain.request());
      System.out.println("Response " + response.code());
      System.out.println(response);
      if (response.code() == 429) {
        //Most HttpUrlConnectionImpl's are case insensitive, but the interface
        //doesn't actually restrict it so let's be safe and check.
        String retryAfterString = response.header("Retry-After");
        if (retryAfterString != null) {
          retryAfterString = response.header("retry-after");
        }
        try {
          if (retryAfterString == null) {
            System.out.println("No Retry-After value found");
          } else {
            long parsedThrottle = Long.parseLong(retryAfterString) * 1000;
            if (parsedThrottle > 0) {
              retryAfter = System.currentTimeMillis() + parsedThrottle;
              System.out.println("Retry-After value: " + parsedThrottle);
              System.out.println("Next request may not be attempted for " + retryAfter + "ms");
            }
          }
        } catch (NumberFormatException nfe) {
          System.out.println("Unable to parse retry-after header, next request will not be rate-limited.");
        }
      }
      return response;
    }
  }
}

/**
 * This wrapper is to take care of this case:
 * when the deserialization fails due to JsonParseException and the
 * expected type is String, then just return the body string.
 */
class GsonResponseBodyConverterToString<T> implements Converter<ResponseBody, T> {
  private final Gson gson;
  private final Type type;

  GsonResponseBodyConverterToString(Gson gson, Type type) {
    this.gson = gson;
    this.type = type;
  }

  @Override public T convert(ResponseBody value) throws IOException {
    String returned = value.string();
    try {
      return gson.fromJson(returned, type);
    }
    catch (JsonParseException e) {
      return (T) returned;
    }
  }
}

class GsonCustomConverterFactory extends Converter.Factory
{
  private final Gson gson;
  private final GsonConverterFactory gsonConverterFactory;

  public static GsonCustomConverterFactory create(Gson gson) {
    return new GsonCustomConverterFactory(gson);
  }

  private GsonCustomConverterFactory(Gson gson) {
    if (gson == null)
      throw new NullPointerException("gson == null");
    this.gson = gson;
    this.gsonConverterFactory = GsonConverterFactory.create(gson);
  }

  @Override
  public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
    if (type.equals(String.class))
      return new GsonResponseBodyConverterToString<Object>(gson, type);
    else
      return gsonConverterFactory.responseBodyConverter(type, annotations, retrofit);
  }

  @Override
  public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
    return gsonConverterFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
  }
}
