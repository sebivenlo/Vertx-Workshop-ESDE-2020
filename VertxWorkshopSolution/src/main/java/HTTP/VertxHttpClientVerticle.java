package HTTP;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.client.HttpRequest;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClient;

/**
 * The verticle to communicate with the REST backend.
 *
 * @author Florian
 */
public class VertxHttpClientVerticle extends AbstractVerticle {

    HttpRequest<JsonObject> request;

    /**
     * Use the io.vertx.ext.web.client in order to make requests to the
     * REST application at localhost:8080 - one request that sends data @post -
     * one that received data @get
     *
     * Hint: Lookup the routes in the REST application.
     *
     * @throws Exception
     */
    @Override
    public void start() throws Exception {
        // TODO8: Insert data by using @post
        WebClient client = WebClient.create(vertx);
        client
                .post(8080, "localhost", "/api/articles")
                .sendJsonObject(new JsonObject()
                        .put("title", "Dale")
                        .put("url", "Cooper"), ar -> {
                    if (ar.succeeded()) {
                        // Ok
                    }
                });
        // TODO9: Receive all data by using @get
        client
                .get(8080, "localhost", "/api/articles")
                .send(ar -> {
                    if (ar.succeeded()) {
                        // Obtain response
                        HttpResponse<Buffer> response = ar.result();
                        System.out.println("Received response with status code" + response.bodyAsString());
                    } else {
                        System.out.println("Something went wrong " + ar.cause().getMessage());
                    }
                });
    }
}
