FROM openjdk:17-jdk-slim
ARG JAR_FILE=datafel.jar
COPY ${JAR_FILE} app_datafel.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_datafel.jar"]