package Verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

/**
 * Verticle that sends internal messages via the event bus.
 *
 * @author Florian
 */
public class EventBusSenderVerticle extends AbstractVerticle {

    /**
     * Todo6: Send one message to all receiver-verticles and one message to one
     * verticle.
     *
     * Hint: publish and send
     *
     * @param startFuture
     */
    @Override
    public void start(Future<Void> startFuture) {
        vertx.eventBus().publish("anAddress", "message 2");
        vertx.eventBus().send("anAddress", "message 1");
    }
}
