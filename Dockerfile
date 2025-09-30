# Stage 1: Build the JAR
FROM maven:3.9.1-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Runtime
FROM eclipse-temurin:17
WORKDIR /app
COPY --from=build /app/target/Train-0.0.1-SNAPSHOT.jar /app/train.jar
ENTRYPOINT ["java", "-jar", "train.jar"]
