FROM maven:3.8.6-openjdk-20.ea-b24 AS builder
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:20-jdk-slim
COPY --from=builder /HNG-0.0.1-SNAPSHOT.jar HNG.jar
EXPOSE 8919
ENTRYPOINT ["java", "-jar", "HNG.jar"]