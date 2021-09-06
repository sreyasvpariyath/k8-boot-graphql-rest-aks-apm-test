FROM openjdk:11.0.6-jre
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8081
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]