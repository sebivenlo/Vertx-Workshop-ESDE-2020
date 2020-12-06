# Vertx-workshop

Vertx is a java framework that allows you to develop concurrent event-driven application. This workshop is supposed to teach fundamental concepts as well as relevant use cases.

### Prerequisites
* Any Java IDE, e.g. Netbeans (https://netbeans.apache.org/download/index.html)
* JDK 1.7.0 or later. You can use the official Oracle distribution or the OpenJDK version. Make sure the JDK bin directory is on your PATH.
* [Postman](https://www.postman.com/downloads/) to test the REST-aplication (optional)
* Docker for your OS ([Windows](https://docs.docker.com/docker-for-windows/install/), [Mac](https://docs.docker.com/docker-for-mac/install/), [Linux](https://docs.docker.com/engine/install/) 

### Start the application using Docker
create a Vert.x docker image of our application.

#### Build the image with:
    docker build -t vertx_rest  .
This creates an image name vertx_test which we can now execute.

### Then run it with :                
    docker run -it -p 8080:8080 vertx_rest

 
 



