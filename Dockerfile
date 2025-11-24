FROM registry.access.redhat.com/ubi9/openjdk-21

WORKDIR /app

COPY target/demo2-1.0-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]