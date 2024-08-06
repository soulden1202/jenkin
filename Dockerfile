FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY target/docker-0.0.1-SNAPSHOT.jar test.jar
ENTRYPOINT ["java","-jar","/test.jar"]