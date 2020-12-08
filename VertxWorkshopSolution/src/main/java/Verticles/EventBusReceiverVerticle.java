package Verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

/**
 * Verticle that can receive messages via the event bus based on a specified
 * address.
 *
 * @author Florian
 */
public class EventBusReceiverVerticle extends AbstractVerticle {

    private String name = null;

    public EventBusReceiverVerticle(String name) {
        this.name = name;
    }

    /**
     * TODO 4: Implement a consumer that takes an address (@String) and a handler
     * that proofs that messages can be received.
     *
     * Hint: use vertx.eventBus() to provide a reference for the verticle to the
     * event bus.
     *
     * @param startFuture
     */
    public void start(Future<Void> startFuture) {
        vertx.eventBus().consumer("anAddress", message -> {
            System.out.println(this.name
                    + " received message: "
                    + message.body());
        });
    }
}
