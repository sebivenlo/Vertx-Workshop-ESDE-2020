# Vertx-workshop

Vertx is a java framework that allows you to write event-driven application by developing components in the language that you think most appropriate for the task, such as Java,Kotlin, Scala,Ruby and so on.

### Start the application using Docker
create a Vert.x docker image of our application.

#### first create Dockerfile and place this Dockerfile into a folder along with the compiled JAR.

FROM vertx/vertx3
ENV VERTICLE_NAME io.vertx.intro.first.MyFirstVerticle
ENV VERTICLE_FILE my-first-app-1.0-SNAPSHOT.jar
 
ENV VERTICLE_HOME .
 
EXPOSE 8080
 
COPY $VERTICLE_FILE $VERTICLE_HOME/
 
WORKDIR $VERTICLE_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec vertx run $VERTICLE_NAME -cp $VERTICLE_HOME/*"]

#### build the image with:
 docker build -t vertx_test  .
 This creates an image name vertx_test which we can now execute.
 
 Then run it with: 
 docker run -it -p 8080:8080 vertx_test

 
 



