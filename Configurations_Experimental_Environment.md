# Microservices Architecture with Consensus Mechanisms and Enhanced Saga Pattern

## Overview
This project implements a microservices architecture using Spring Boot, Spring Cloud, and Consul for service discovery. It includes an API Gateway, Order Service, and Payment Service. The project demonstrates the use of Paxos consensus mechanisms and Enhanced Saga Pattern for distributed transactions within a microservices architecture.

## Features
- Centralized API Gateway for routing requests
- Order Service with Paxos consensus mechanisms
- Payment Service for processing payments
- Consul for service discovery
- Enhanced Saga Pattern for managing distributed transactions

## Prerequisites
- JDK 19
- Maven
- Consul
- Physical Hosts:
    - Intel Core i7, 8 Cores, 16.0 GB RAM
    - 100 Mbps LAN

## Host Configuration
### Physical Host Specifications
- **CPU:** Intel Core i7, 8 Cores
- **RAM:** 16.0 GB
- **Operating System:** Recommended to use a modern Linux distribution (e.g., Ubuntu 20.04 LTS) or a compatible version of Windows.
- **Java Environment:**
  ```sh
  sudo apt update
  sudo apt install openjdk-19-jdk
  java -version
  ```
## Network Configuration: 
    Ensure network connectivity with 100 Mbps LAN

## Steps for All Hosts
1. Install Java 19: Ensure that Java 19 is installed and set up on each host. Verify the installation with java -version.
2. Configure Network: Make sure all hosts are connected via a 100 Mbps LAN network for reliable and fast communication.
3. Clone the Project Repository: Clone the project repository on each host or distribute the compiled code to each host.
4. Run the Microservices: Deploy and run the microservices (Order Service, Payment Service, and API Gateway) on the respective hosts. Ensure Consul is running and configured properly for service discovery.
5. Monitor and Manage: Use monitoring tools (like Spring Boot Actuator) to keep track of the health and performance of the services

## Running the Services
### Start Consul: 
**Start the Consul agent locally on each host**:
````sh
  consul agent -dev
````
### Build and Run API Gateway
**Navigate to the API Gateway directory and use Maven to build and run the service**:
````sh
  cd api-gateway
  mvn clean install
  mvn spring-boot:run
````

### Build and Run Order Service
**Navigate to the Order Service directory and use Maven to build and run the service**:
````
cd order-service
mvn clean install
mvn spring-boot:run
````

### Build and Run Payment Service
**Navigate to the Payment Service directory and use Maven to build and run the service**:

````
cd payment-service
mvn clean install
mvn spring-boot:run
````

### JMeter Performance Testing
**A JMeter test plan (test-plan.jmx) is provided to prove the performance improvement of the implementation**:
1. Open test-plan.jmx with JMeter.
2. Configure the test plan parameters (number of threads, loop count, etc.).
3. Execute the test plan to simulate load and measure performance.

