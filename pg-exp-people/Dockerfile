FROM adoptopenjdk/openjdk14:latest
VOLUME /tmp
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} pg-exp-people.jar
ENTRYPOINT ["java","-jar","/pg-exp-people.jar"]
EXPOSE 8761
MAINTAINER bharat.savanur@gmail.com

#docker build -t pg-service/pg-expense .

#Need to run with link to the host name of the services it access over network.
#else create a kubernetes cluster/load balancer
#docker run -p 8081:8081 --link pg-eureka --name=pg-expens-people pg-service/pg-people

#Final Command
#docker run -p 8081:8081 --link pg-eureka --name=pg-expens-people pg-service/pg-people