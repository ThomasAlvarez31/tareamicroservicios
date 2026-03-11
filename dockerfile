
FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app

# Copiar archivos del proyecto
COPY pom.xml .
COPY src ./src

# Compilar proyecto
RUN mvn clean package -DskipTests

# Etapa de ejecución
FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copiar jar compilado
COPY --from=build /app/target/*.jar app.jar

# Puerto usado por Render
EXPOSE 8080

# Ejecutar aplicación
ENTRYPOINT ["java","-jar","app.jar"]