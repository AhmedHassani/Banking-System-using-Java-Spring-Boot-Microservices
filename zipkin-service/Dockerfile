FROM openjdk:8-jdk-alpine
MAINTAINER Ahmed Rahman <ah.jr22@gmail.com>
ADD target/*.jar zipkin-service.jar
EXPOSE 9411
ENTRYPOINT ["java", "-jar", "/zipkin-service.jar"]
