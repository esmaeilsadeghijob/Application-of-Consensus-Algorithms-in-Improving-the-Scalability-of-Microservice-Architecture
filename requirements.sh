#!/bin/bash

# Update the package list
sudo apt-get update

# Install Git
sudo apt-get install -y git

# Install JDK 17
sudo apt-get install -y openjdk-17-jdk

# Install JMeter
sudo apt-get install -y jmeter

# Install PostgreSQL
sudo apt-get install -y postgresql postgresql-contrib

# Set up PostgreSQL user and database
sudo -u postgres psql -c "CREATE USER myuser WITH ENCRYPTED PASSWORD 'mypassword';"
sudo -u postgres psql -c "CREATE DATABASE mydb OWNER myuser;"

# Install SQLite
sudo apt-get install -y sqlite3 libsqlite3-dev

# Install Maven
sudo apt-get install -y maven

# Install Consul
CONSUL_VERSION="1.10.0"
curl -O https://releases.hashicorp.com/consul/${CONSUL_VERSION}/consul_${CONSUL_VERSION}_linux_amd64.zip
unzip consul_${CONSUL_VERSION}_linux_amd64.zip
sudo mv consul /usr/local/bin/
rm consul_${CONSUL_VERSION}_linux_amd64.zip

# Start Consul agent in development mode
consul agent -dev &

# Clone the GitHub repository
git clone https://github.com/esmaeilsadeghijob/Application-of-Consensus-Algorithms-in-Improving-the-Scalability-of-Microservice-Architecture.git

# Navigate to the project directory
cd Application-of-Consensus-Algorithms-in-Improving-the-Scalability-of-Microservice-Architecture
