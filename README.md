# Application-of-Consensus-Algorithms-in-Improving-the-Scalability-of-Microservice-Architecture

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

## Jmeter Test Plan
**To create a JMeter test plan for proving the performance improvement**:
1. **Install JMeter**: Download and install Apache JMeter from [Apache JMeter](https://jmeter.apache.org/download_jmeter.cgi).
2. **Create a Test Plan**: Open JMeter and create a new test plan. Add Thread Groups, HTTP Request Samplers, and necessary listeners to simulate the load and measure the performance of your microservices.

#### Below is an example of how you can create the test plan:
1. **Step 1**: Add a Thread Group
   * Right-click on the Test Plan > Add > Threads (Users) > Thread Group.
   * Configure the Thread Group:
     - Number of Threads (users): 10
     - Ramp-Up Period (in seconds): 10
     - Loop Count: 1000

2. **Step 2**: Add HTTP Request Samplers
* Right-click on the Thread Group > Add > Sampler > HTTP Request.
* Configure the HTTP Request:
     - Name: Create Order
     - Server Name or IP: localhost
     - Port Number: 8081
     - Method: POST
     - Path: /orders
     - Body Data:
    ````json
        {
        "product": "Product A",
        "quantity": 10,
        "price": 100.00
        }
    ````

* Right-click on the Thread Group > Add > Sampler > HTTP Request.
* Configure the HTTP Request:
     - Name: Process Payment
     - Server Name or IP: localhost
     - Port Number: 8082
     - Method: POST
     - Path: /payments
     - Body Data:
    ```json
    {
    "orderId": 1,
    "amount": 100.00
    }
    ````

3. **Step 3**: Add Listeners
* Right-click on the Thread Group > Add > Listener > View Results Tree.
* Right-click on the Thread Group > Add > Listener > Summary Report.
* Right-click on the Thread Group > Add > Listener > Aggregate Report.

#### JMeter Test Plan (JMX File)
A sample JMeter test plan in XML format is provided in the project path. 
This content is stored in a file called [test-plan.jmx](https://github.com/esmaeilsadeghijob/Application-of-Consensus-Algorithms-in-Improving-the-Scalability-of-Microservice-Architecture/blob/main/test-plan.jmx) and can be executed with JMeter.



## Contact
**For any questions or support, please contact esmaeil sadeghi at [esmaeilsadeghijob@gmail.com](mailto:esmaeilsadeghijob@gmail.com)**.
