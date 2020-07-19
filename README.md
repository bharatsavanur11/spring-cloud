### spring-cloud
A Sample Spring Cloud Services Components Deployed on Cloud Service
which uses google jib plugin to create docker images without the need for docker client installed locally.


In this application:

a. Cloud Gateway Service Running on 9090 port.

b. Euraka Server Service Running on 8761 port

c. PG Expense Service and Hystrix Running on on 9081 server.

d. PG People Service and Hystrix Running on 8081 and need to 
   pass spring.profiles.active=development while running spring boot
   app for cloud config properties)

e. Zipkin Server Running on 9411 as a separate jar.(This is present in ("C:\Users\Admin\bharat\zipkin") location and it can be run via 
java -jar zipkin-server-2.21.5-exec.jar

URL:http://localhost:9411/zipkin/

f. Load Balanced Client running in Expense Service to 
   make the calling service agnostic.

g. Distributed Tracing Enabled.

h. Actuator Enabled in Expense Service to get the metrics in real time.
http://localhost:9081/actuator/metrics/jvm.memory.max
   

Below are the docker commands for the same:



