FROM amazoncorretto:8u342

ARG JAR_FILE=target/first-example.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]
