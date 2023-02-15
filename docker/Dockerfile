FROM openjdk:17-jdk-slim

EXPOSE 8080
WORKDIR /opt/app

ARG JAR_FILE=../target/music-pulse-0.0.1-SNAPSHOT.jar
ARG PROP_FILE=application.properties

ADD ${JAR_FILE} app.jar
ADD ${PROP_FILE} application.properties

ENV MYSQL_HOST="172.17.0.2"
ENV MYSQL_PASS="123123"
ENV MYSQL_PORT="3306"

ENTRYPOINT ["java", "-jar", "app.jar"]