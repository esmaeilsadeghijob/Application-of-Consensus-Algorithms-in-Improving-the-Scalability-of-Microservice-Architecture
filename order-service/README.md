# Order Service

## Overview
The Order Service is a microservice designed to manage orders in a distributed system. It uses Spring Boot, Spring Data JPA for database interactions, and Consul for service discovery. The service also implements the Paxos consensus algorithm to ensure strong consistency across distributed nodes.

## Features
- Create and manage orders
- Integrate with Paxos for consensus
- Connect with Consul for service discovery
- RESTful API for order operations

## Prerequisites
- JDK 17 or higher
- Maven
- Consul

## Running the Service

### 1. Start Consul
Start the Consul agent locally:
```sh
  consul agent -dev
```

**Build and Run the Service**: Navigate to the project directory and use Maven to build and run the service
````sh
  mvn clean install
  mvn spring-boot:run
````

## Create Order
**Endpoint**: /orders Method: POST Request Body:
````json
    {
      "product": "Product Name",
      "quantity": 10,
      "price": 100.00
    }
````

