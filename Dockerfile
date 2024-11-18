# Use openjdk as the base image
FROM openjdk:11-jre-slim

# Set working directory
WORKDIR /app

# Copy the application JAR file
#COPY /app.jar /app/app.jar
COPY target/BankingMicroservice-1.0-SNAPSHOT.jar /app/app.jar


# Expose port 8080 for the application
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
