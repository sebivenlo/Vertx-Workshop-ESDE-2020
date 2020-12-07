package HTTP;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClient;

/**
 * The verticle to communicate with the REST backend.
 *
 * @author Florian
 */
public class VertxHttpClientVerticle extends AbstractVerticle {

    /**
     * Use the io.vertx.ext.web.client in order to make requests to the REST
     * application at localhost:8080 - one request that sends data @post - one
     * that received data @get
     *
     * Hint: Lookup the routes in the REST application.
     *
     * @throws Exception
     */
    @Override
    public void start() throws Exception {
        // TODO 8: Add "progresswww" (https://progresswww.nl) by using @post
        WebClient client = WebClient.create(vertx);

        // TODO 9: Receive all data by using @get
    }
}
