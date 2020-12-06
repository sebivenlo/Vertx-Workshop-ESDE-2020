# Vertx-workshop

Vertx is a java framework that allows you to develop concurrent event-driven application. This workshop is supposed to teach fundamental concepts as well as relevant use cases.

### 1 Prerequisites
* Any Java IDE, e.g. Netbeans (https://netbeans.apache.org/download/index.html)
* JDK 1.7.0 or later. You can use the official Oracle distribution or the OpenJDK version. Make sure the JDK bin directory is on your PATH.
* [Postman](https://www.postman.com/downloads/) to test the REST-aplication (optional)
* Docker for your OS ([Windows](https://docs.docker.com/docker-for-windows/install/), [Mac](https://docs.docker.com/docker-for-mac/install/), [Linux](https://docs.docker.com/engine/install/) )

### 2 How to run the REST-application in Docker
The goal is to create a docker image of `VertxRESTServer` and to deploy it. This is nessecary to do complete all assignments.

#### 2.1 Build the image with:
    docker build -t vertx_rest  .
This creates an image name vertx_test which we can now execute.

#### 2.2 Then run it with:                
    docker run -it -p 8080:8080 vertx_rest

#### 2.3 Validate if it is runnable
Open "Docker Desktop" -> Click on Container/Apps -> you now should see the application running (glowing green and labeled as "RUNNING").
 
### How to do the assignment
Assuming all prerequisites are installed and the `VertxRESTServer` is running in Docker:
1. Open `VertxWorkshopAssignment`
2. Tasks are declared as "// Todo X" (where X is the task number that declares the order). It is useful to have them displayed.
   - Netbeans: `Windows → Action Items` OR `press ctrl + 6 in order to open the "Action Items" tab`
   - Eclipse: Go to `Window → Show View → Tasks`
   - IntelliJ: `View →  Tool Windows →  TODO` OR `ctrl + numpad +`
3. Work on them
 



