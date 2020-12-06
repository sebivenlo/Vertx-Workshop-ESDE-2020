package io.vertx.intro.first;

import io.vertx.core.Vertx;
import java.io.IOException;

/**
 * Used to deploy our rest application. Thus required for Docker.
 *
 * @author Florian
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(RESTVerticle.class.getName());
    }
}
