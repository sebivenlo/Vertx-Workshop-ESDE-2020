# Vertx-Workshop

Vertx is a java framework that allows you to develop concurrent event-driven application. This workshop is supposed to teach fundamental concepts as well as relevant use cases.

# Use Cases
Vert.x is great for applications that require concurrency. Be it modern apps that deal with high traffic (e.g. Instagram, Facebook etc.) and a lot of responsiblities at the same time or for other scenarios where should be split up to reduce execution time. A good example for splitting up workload is Selenium. It is a testing framework to test web applications. Test cycles are often time costly since many web forms must be filled out and navigated through. Given a huge amount of test cases it would be helpful to split them up so that parallel execution is possible. Vert.x would be a good choice for that goal.
### 1 Prerequisites
* Any Java IDE, e.g. Netbeans (https://netbeans.apache.org/download/index.html)
* JDK 1.8.0 or later. You can use the official Oracle distribution or the OpenJDK version. Make sure the JDK bin directory is on your PATH.
* [Postman](https://www.postman.com/downloads/) to test the REST-aplication (optional)
* Docker for your OS ([Windows](https://docs.docker.com/docker-for-windows/install/), [Mac](https://docs.docker.com/docker-for-mac/install/), [Linux](https://docs.docker.com/engine/install/) )

### 2 How to run the REST-application in Docker
The goal is to create a docker image of `VertxRESTServer` and to deploy it. This is nessecary to complete all assignments.

#### 2.1 Create a runnable image:
    docker build -t vertx_rest  .

#### 2.2 Then run it with:                
    docker run -it -p 8080:8080 vertx_rest

#### 2.3 Validate if it is runnable
* Open "Docker Desktop" -> Click on Container/Apps -> you now should see the application running (glowing green and labeled as "RUNNING").
* Furthermore you can check with your browser/postman if it is accessible by calling http://localhost:8080/api/articles (GET all).
 
### 3 How to do the assignment
Assuming all prerequisites are installed and the `VertxRESTServer` is running in Docker:
1. Open `VertxWorkshopAssignment`

2. Tasks are declared as "// Todo X" (where X is the task number that declares the order). It is useful to have them displayed.
   - Netbeans: `Windows → Action Items` OR `press ctrl + 6 in order to open the "Action Items" tab`
   - Eclipse: Go to `Window → Show View → Tasks`
   - IntelliJ: `View →  Tool Windows →  TODO` OR `ctrl + numpad +`
   
3. Work on them
 



