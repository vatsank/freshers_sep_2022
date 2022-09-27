FROM amazoncorretto:8u342

ARG JAR_FILE=target/lumen-student-service.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]
