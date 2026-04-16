# 1. Usamos una imagen de Java 17 (el motor)
FROM eclipse-temurin:17-jdk-alpine

# 2. Creamos una carpeta para la app
WORKDIR /app

# 3. Copiamos el archivo que genera Maven (el .jar) a la nube
COPY target/*.jar app.jar

# 4. El comando para que el museo abra sus puertas
ENTRYPOINT ["java","-jar","app.jar"]
