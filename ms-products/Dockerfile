# Utilizar una imagen base de Java (ajusta la versión si es necesario).
FROM openjdk:21-jdk-slim

# Crear un directorio para la aplicación.
WORKDIR /app
		
# Copiar el archivo JAR generado al contenedor.
ADD ./target/ms-products-0.0.1-SNAPSHOT.jar app.jar
# Exponer el puerto que usa la aplicación.
EXPOSE 7654
		
# Comando para ejecutar la aplicación.
ENTRYPOINT ["java", "-jar", "app.jar"]