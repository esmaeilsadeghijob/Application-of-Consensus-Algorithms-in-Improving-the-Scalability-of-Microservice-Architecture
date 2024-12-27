# Payment Service

## Overview
The Payment Service is a microservice designed to manage payments in a distributed system. It uses Spring Boot, Spring Data JPA for database interactions, and Consul for service discovery. The service provides a RESTful API for processing and managing payments associated with orders.

## Features
- Process and manage payments
- Connect with Consul for service discovery
- RESTful API for payment operations

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

## Build and Run the Service
- **Navigate to the project directory and use Maven to build and run the service**:
```sh
  mvn clean install
  mvn spring-boot:run
```

## API Endpoints
- **Endpoint**: /payments Method: POST Request Body:
````json
    {
      "orderId": 1,
      "amount": 100.00
    }
````
