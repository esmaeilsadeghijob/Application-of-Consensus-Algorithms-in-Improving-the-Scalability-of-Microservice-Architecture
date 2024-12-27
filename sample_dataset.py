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