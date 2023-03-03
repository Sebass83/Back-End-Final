FROM amazoncorretto:11-alpine-jdk
MAINTAINER SebastianSantos
COPY target/back-end-0.0.1-SNAPSHOT.jar  back-end.jar
ENTRYPOINT ["java","-jar","/back-end.jar"]