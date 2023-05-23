
FROM openjdk:17-slim

EXPOSE 8080

COPY target/TareaAutos-0.0.1-SNAPSHOT.jar autos.jar

CMD ["java","-jar","autos.jar"]