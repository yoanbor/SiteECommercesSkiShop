FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml /app
RUN mvn dependency:go-offline
COPY src /app/src
RUN mvn clean install

FROM openjdk:17
LABEL app="Hospitol"
LABEL version=1.0.0
LABEL description="Hospitol permet de gérer le séjour des patients"
WORKDIR /app
COPY --from=build /app/target/Hospitol-0.0.1-SNAPSHOT.jar /app/Hospitol-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "Hospitol-0.0.1-SNAPSHOT.jar"]
