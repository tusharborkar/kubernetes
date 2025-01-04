# Use the OpenJDK 17 slim image as a base
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the built JAR file into the container
COPY target/kubernetes-3.4.1.jar kubernetes.jar

# Expose port 8080 for the Spring Boot app
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "kubernetes.jar"]
