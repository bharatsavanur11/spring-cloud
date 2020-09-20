FROM adoptopenjdk/openjdk14:latest
VOLUME /tmp
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} pg-exp-eureka-server.jar
ENTRYPOINT ["java","-jar","/pg-exp-eureka-server.jar"]
EXPOSE 8761
MAINTAINER bharat.savanur@gmail.com

#docker build -t pg-service/pg-expense.
#docker run -p 9081:9081 pg-service/pg-expense
#Final Command
#docker run -p 8761:8761   --name=pg-eureka pg-service/pg-eureka