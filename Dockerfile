FROM amazoncorretto:17
MAINTAINER Diegoleonardi
COPY target/web-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]