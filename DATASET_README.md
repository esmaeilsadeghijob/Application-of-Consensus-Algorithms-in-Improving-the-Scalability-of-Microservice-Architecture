# Python Script to Generate Sample Data
````shell
import pandas as pd 
import numpy as np 
import random
 from datetime import datetime, timedelta
  # Number of records 
  num_records = 5000 
  # Function to generate random datetime
  def random_date(start, end):
   return start + timedelta(seconds=random.randint(0, int((end - start).total_seconds()))) 
  
  # Generating sample data 
  data = { 
    "Order ID": np.arange(1, num_records + 1),
     "Product": [f"Product {chr(65 + i%26)}" for i in range(num_records)],
      "Quantity": np.random.randint(1, 20, num_records), 
      "Price": np.round(np.random.uniform(10.0, 500.0, num_records), 2), 
      "Payment Status": np.random.choice(["Completed", "Failed"], num_records), 
      "Transaction Time": [random_date(datetime(2024, 1, 1), datetime(2024, 12, 31)).strftime("%Y-%m-%d %H:%M:%S") for _ in range(num_records)], 
      "Fault Tolerance": np.random.choice(["High", "Moderate"], num_records), 
      "Latency (ms)": np.random.randint(50, 200, num_records), 
      "Throughput (req/sec)": np.random.randint(300, 600, num_records), 
      "Consistency": np.random.choice(["Strong", "Eventual"], num_records) 
  } 
      
  # Creating a DataFrame
  df = pd.DataFrame(data) 
  
  # Saving to Excel
  df.to_excel("test_data.xlsx", index=False) 
  
  print("Sample datasheet created successfully!")
````

## How to Use the Script
1. **Install Dependencies**: Ensure you have pandas and openpyxl installed. You can install them using pip:
````sh
pip install pandas openpyxl
````

2. **Run the Script**: Save the script to a file, say generate_data.py, and run it:
 ````sh  
python generate_data.py
````

3. **Explanation of the Columns**
   - Order ID: A unique identifier for each order.
   - Product: The product name, randomly assigned.
   - Quantity: The quantity of the product ordered.
   - Price: The price of the product.
   - Payment Status: The status of the payment (Completed or Failed).
   - Transaction Time: A randomly generated date and time for the transaction.
   - Fault Tolerance: The fault tolerance level (High or Moderate).
   - Latency (ms): The latency in milliseconds.
   - Throughput (req/sec): The number of requests processed per second.
   - Consistency: The consistency level (Strong or Eventual).
