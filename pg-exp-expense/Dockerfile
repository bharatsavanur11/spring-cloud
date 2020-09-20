FROM adoptopenjdk/openjdk14:latest
VOLUME /tmp
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} pg-exp-expense.jar
ENTRYPOINT ["java","-jar","/pg-exp-expense.jar"]
EXPOSE 8761
MAINTAINER bharat.savanur@gmail.com

#docker build -t pg-service/pg-expense .

#Need to run with link to the host name of the services it access over network.
#else create a kubernetes cluster/load balancer

#Depends on two service for end points and hence links at the docker start uo
#Best defined in docker compose file.
#docker run -p 9081:9081 --link pg-eureka --link pg-expens-people --name=pg-expens-service pg-service/pg-expense