FROM amazoncorretto:17-alpine-jdk
MAINTAINER Knight13
COPY target/demo-0.0.1-SNAPSHOT.jar tercermes-app.jar
ENTRYPOINT ["java","-jar","/tercermes-app.jar"]