# Implementing the Epic Pattern for Distributed Transactions in Microservice Architectures using Spring Boot

## Overview
This project demonstrates how to implement the Epic pattern for distributed transactions in a microservices architecture using Spring Boot, Spring Cloud, and OpenFeign. The architecture consists of three microservices: API Gateway, Order Service, and Payment Service. This implementation showcases how the Epic pattern enhances the Saga pattern for managing distributed transactions within a microservices architecture.

## Prerequisites
- JDK 17 or higher
- Maven
- Consul
- Docker (optional, for running Consul)

## Architecture
The architecture consists of the following microservices:
1. **API Gateway**: Routes client requests to the appropriate backend services.
2. **Order Service**: Manages order creation and interacts with the Payment Service.
3. **Payment Service**: Processes payments for the orders.

The `EpicSagaService` in the Order Service coordinates the distributed transaction by interacting with the Payment Service using OpenFeign.


