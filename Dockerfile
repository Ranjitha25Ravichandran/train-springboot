FROM eclipse-temurin:17

LABEL mentainer="ranjitharavi25@gmail.com"

WORKDIR /app

COPY target/Train-0.0.1-SNAPSHOT.jar  /app/train.jar

ENTRYPOINT ["java", "-jar", "train.jar"]
