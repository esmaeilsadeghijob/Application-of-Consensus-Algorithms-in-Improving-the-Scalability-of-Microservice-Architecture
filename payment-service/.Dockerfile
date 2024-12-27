# Use the official OpenJDK 17 image as the base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the built jar file into the container
COPY target/payment-service-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the application runs on
EXPOSE 8082

# Define the entry point for the container
ENTRYPOINT ["java", "-jar", "app.jar"]
