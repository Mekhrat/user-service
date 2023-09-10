FROM openjdk:11
MAINTAINER mekhrat
COPY target/userService-1.jar user-service.jar
ENTRYPOINT ["java", "-jar", "user-service.jar"]