FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8082
ARG JAR_FILE
COPY ${JAR_FILE} service.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service.jar"]