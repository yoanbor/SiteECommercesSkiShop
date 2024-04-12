FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml /app
RUN mvn dependency:go-offline
COPY src /app/src
RUN mvn clean install

FROM openjdk:17
LABEL app="Skishop"
LABEL version=0.0.1
LABEL description="Skishop est un site ecommerce de vente de ski"
WORKDIR /app
COPY --from=build /app/target/Skishop-0.0.1-SNAPSHOT.jar /app/Skishop-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", ".jar"]
