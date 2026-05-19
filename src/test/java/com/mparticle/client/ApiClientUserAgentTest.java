package com.mparticle.client;

import com.mparticle.ApiClient;
import com.mparticle.model.Batch;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Call;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ApiClientUserAgentTest {

    private MockWebServer server;

    @Before
    public void setUp() throws IOException {
        server = new MockWebServer();
        server.start();
    }

    @After
    public void tearDown() throws IOException {
        server.shutdown();
    }

    private EventsApi buildApi(ApiClient client) {
        client.getAdapterBuilder().baseUrl(server.url("/"));
        return client.createService(EventsApi.class);
    }

    // Case 1: Default path — OkHttp's User-Agent must not appear on the wire.
    @Test
    public void defaultPath_noUserAgentHeader() throws Exception {
        server.enqueue(new MockResponse().setResponseCode(202));

        EventsApi api = buildApi(new ApiClient("key", "secret"));
        Call<Void> call = api.uploadEvents(new Batch().environment(Batch.Environment.DEVELOPMENT));
        call.execute();

        RecordedRequest recorded = server.takeRequest();
        assertNull("Expected no User-Agent header", recorded.getHeader("User-Agent"));
    }

    // Case 2: Caller sets User-Agent via an interceptor — value must be preserved.
    @Test
    public void callerOverride_userAgentPreserved() throws Exception {
        server.enqueue(new MockResponse().setResponseCode(202));

        ApiClient client = new ApiClient("key", "secret");
        // Add after construction: runs after UserAgentInterceptor in the chain,
        // so its User-Agent value reaches the network.
        client.getOkBuilder().addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request modified = chain.request().newBuilder()
                        .header("User-Agent", "my-app/1.0")
                        .build();
                return chain.proceed(modified);
            }
        });

        EventsApi api = buildApi(client);
        Call<Void> call = api.uploadEvents(new Batch().environment(Batch.Environment.DEVELOPMENT));
        call.execute();

        RecordedRequest recorded = server.takeRequest();
        assertEquals("my-app/1.0", recorded.getHeader("User-Agent"));
    }

    // Case 3: configureFromOkclient path — no User-Agent should appear on the wire.
    @Test
    public void configureFromOkclient_noUserAgentHeader() throws Exception {
        server.enqueue(new MockResponse().setResponseCode(202));

        ApiClient client = new ApiClient("key", "secret");
        OkHttpClient customClient = new OkHttpClient.Builder().build();
        client.configureFromOkclient(customClient);

        EventsApi api = buildApi(client);
        Call<Void> call = api.uploadEvents(new Batch().environment(Batch.Environment.DEVELOPMENT));
        call.execute();

        RecordedRequest recorded = server.takeRequest();
        assertNull("Expected no User-Agent header via configureFromOkclient", recorded.getHeader("User-Agent"));
    }
}
