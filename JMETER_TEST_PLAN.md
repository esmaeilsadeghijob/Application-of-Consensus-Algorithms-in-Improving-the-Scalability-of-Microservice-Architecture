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
