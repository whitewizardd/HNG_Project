#FROM maven:3.8.6-openjdk-20.ea-b24 AS builder
#COPY . .
#RUN mvn clean package -DskipTests
#
#FROM openjdk:20-jdk-slim
#COPY --from=builder /HNG-0.0.1-SNAPSHOT.jar HNG.jar
#EXPOSE 8919
#ENTRYPOINT ["java", "-jar", "HNG.jar"]

# Build stage
#
#FROM maven:3.8.2-jdk-11 AS build
#COPY . .
#RUN mvn clean package -Pprod -DskipTests

#
# Package stage
#
#FROM openjdk:11-jdk-slim
#COPY --from=build /target/HNG-0.0.1-SNAPSHOT.jar demo.jar
## ENV PORT=8080
#EXPOSE 8919
#ENTRYPOINT ["java","-jar","demo.jar"]

FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/hng.jar"]
EXPOSE 8080