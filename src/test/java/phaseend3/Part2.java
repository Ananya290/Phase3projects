/*import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.hamcrest.Matchers;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.HashMap;
import java.util.Map;

public class Part2 {

    private static final Map<String, String> ENVIRONMENT_STATUS_MAP = new HashMap<>();

    static {
        ENVIRONMENT_STATUS_MAP.put("DEV", "available_DEV");
        ENVIRONMENT_STATUS_MAP.put("QA", "available_QA");
        ENVIRONMENT_STATUS_MAP.put("PROD", "available_PROD");
    }

    @Test
    @Parameters("env")
    public void putCallTesting(String env) throws Exception {
        String serviceUrl = "https://petstore.swagger.io/v2/pet";
        String jsonBody = String.format("{\"id\": 9223372016900013000, \"category\": {\"id\": 20021, \"name\": \"string\"}, \"name\": \"doggie\", \"photoUrls\": [\"string\"], \"tags\": [{\"id\": 0, \"name\": \"string\"}], \"status\": \"%s\"}", ENVIRONMENT_STATUS_MAP.get(env));

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPut request = new HttpPut(serviceUrl);
            request.setHeader("Content-Type", "application/json");
            request.setEntity(new StringEntity(jsonBody));

            HttpResponse response = httpClient.execute(request);

            // Assertion 1: Validate response status code
            assertThat(response.getStatusLine().getStatusCode(), Matchers.equalTo(200));

            // Assertion 2: Validate id = 20021 in response
            String responseJson = EntityUtils.toString(response.getEntity());
            assertThat(responseJson, Matchers.containsString("\"id\":20021"));

            // Assertion 3: Validate status value is changing as per environment in JSON response
            assertThat(responseJson, Matchers.containsString(String.format("\"status\":\"%s\"", ENVIRONMENT_STATUS_MAP.get(env))));
        }
    }
}*/
