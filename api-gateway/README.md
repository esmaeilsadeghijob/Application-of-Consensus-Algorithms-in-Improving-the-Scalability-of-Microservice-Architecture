# API Gateway

## Overview
The API Gateway is a microservice designed to act as the entry point for all client requests to the backend microservices. It uses Spring Boot, Spring Cloud Gateway, and Consul for service discovery. The API Gateway routes requests to the appropriate microservices (Order Service and Payment Service) and provides features like load balancing and routing.

## Features
- Centralized entry point for all client requests
- Load balancing and routing
- Integration with Consul for service discovery
- RESTful API for routing requests to backend services

## Prerequisites
- JDK 11 or higher
- Maven
- Consul

## Running the Service

### 1. Start Consul
Start the Consul agent locally:
```sh
  consul agent -dev
```

### Build and Run the Service
**Navigate to the project directory and use Maven to build and run the service**:
````sh
  mvn clean install
  mvn spring-boot:run
````

