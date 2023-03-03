FROM amazoncorretto:11-alpine-jdk
MAINTAINER SebastianSantos
COPY target/back-end-0.0.1-SNAPSHOT.jar back-end-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/back-end-0.0.1-SNAPSHOT.jar"]