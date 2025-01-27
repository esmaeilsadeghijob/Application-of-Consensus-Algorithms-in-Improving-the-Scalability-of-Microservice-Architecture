# Boosting Scalability in Microservice Architectures with Consensus Mechanisms

### Overview This project demonstrates a microservices architecture using Spring Boot, Consul for service discovery, Spring Cloud Gateway as the API Gateway, Paxos for consensus, and the Enhanced Saga pattern for transaction

### Conclusion
````
This sample implementation demonstrates how to use Paxos consensus algorithms in a Spring Boot application to improve the scalability and reliability of microservice architectures. By comparing this implementation with the enhanced Saga pattern, you can evaluate the performance and effectiveness of each approach in managing distributed transactions.
````

### Project Stracture
````
spring-boot-microservices/
    ├── api-gateway/
    ├── order-service/
    ├── payment-service/
    ├── saga-service/
    ├── paxos-service/
    └── README.md
````

## Components 
1. **API Gateway**: Handles routing of requests to appropriate microservices. 
2. **Order Service**: Manages orders and integrates with Paxos for consensus. 
3. **Payment Service**: Manages payments related to orders. 
4. **Consul**: Provides service discovery and health checking. 
5. **Paxos Service**: Ensures consensus and consistency across microservices. 
6. **Saga Service**: Coordinates distributed transactions to ensure data integrity. ## Prerequisites

## Prerequisites 
- JDK 17 or higher 
- Maven 
- Consul 

## Running the Project 
1. **Start Consul**: 
````sh 
consul agent -dev 
````
2. **Build and Run Each Microservice**: 
   - **API Gateway**: 
        ```sh
        cd api-gateway
        mvn clean install
        mvn spring-boot:run
      ``` 
   - **Order Service**: 
       ```sh
        cd order-service
        mvn clean install
        mvn spring-boot:run
      ``` 
   - **Payment Service**: 
       ```sh
        cd payment-service
        mvn clean install
        mvn spring-boot:run
      ```


## Contact
**For any questions or support, please contact esmaeil sadeghi at [esmaeilsadeghijob@gmail.com](mailto:esmaeilsadeghijob@gmail.com)**.
