-- Create table for storing the data
CREATE TABLE order_data (
    order_id SERIAL PRIMARY KEY,
    product VARCHAR(50),
    quantity INT,
    price NUMERIC(10, 2),
    payment_status VARCHAR(20),
    transaction_time TIMESTAMP,
    fault_tolerance VARCHAR(20),
    latency_ms INT,
    throughput_req_sec INT,
    consistency VARCHAR(20)
);

-- Insert data generated from the Python code into the table
-- Use a copy command or individual insert statements
-- Here is an example of inserting data:

COPY order_data (order_id, product, quantity, price, payment_status, transaction_time, fault_tolerance, latency_ms, throughput_req_sec, consistency)
FROM 'path_to_csv_file.csv' DELIMITER ',' CSV HEADER;
