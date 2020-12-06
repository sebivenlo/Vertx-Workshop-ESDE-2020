package Verticles;

import HTTP.VertxHttpClientVerticle;
import io.vertx.core.Vertx;

/**
 *
 * @author Florian
 */
public class VertxVerticleMain {

    public static void main(String[] args) throws InterruptedException {
        // TODO1: Create the vertx instance
        Vertx vertx = Vertx.vertx();
        // TODO2: Deploy the UselessVerticle
        vertx.deployVerticle(new UselessVerticle());
        // TODO5: Deploy two verticles with two different addresses
        vertx.deployVerticle(new EventBusReceiverVerticle("R1"));
        vertx.deployVerticle(new EventBusReceiverVerticle("R2"));
        Thread.sleep(1000);
        // TODO7: Deploy the sender verticle
        vertx.deployVerticle(new EventBusSenderVerticle());
        // TODO10: Deploy the verticle and check the result
        vertx.deployVerticle(new VertxHttpClientVerticle());
    }
}
