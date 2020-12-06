package Verticles;

import io.vertx.core.AbstractVerticle;
import java.util.concurrent.TimeUnit;

/**
 * Verticle which teaches the basic idea of the start and stop method.
 *
 * @author Florian
 */
public class UselessVerticle extends AbstractVerticle {

    /**
     * TODO3: Undeploy the Verticle after 5 seconds. Hint: Use vertx.setTimer!
     *
     * @throws Exception
     */
    @Override
    public void start() throws Exception {
        System.out.println("UselessVerticle started");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("UselessVerticle stopped");
    }
}
