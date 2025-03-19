# Scientific Calculator with DevOps Integration

## Overview
This project is a **Scientific Calculator** implemented in Java and containerized using **Docker**. It follows **DevOps best practices** by integrating **Jenkins for CI/CD, Docker for containerization, and Ansible for local deployment**.

## Features
- **Mathematical Functions**:
  - Square Root (√x)
  - Factorial (x!)
  - Natural Logarithm (ln(x))
  - Power Function (x^b)
- **Dockerized for easy deployment**
- **Automated deployment using Ansible**
- **CI/CD Integration with Jenkins**

---

## Prerequisites
Make sure you have the following installed:
- **Java 11 or later**
- **Docker**
- **Ansible** (for local deployment)
- **Jenkins** (for CI/CD automation)
- **Git**

---

## Installation & Setup

### **1. Clone the Repository**
```bash
git clone https://github.com/your-username/scientific-calculator.git
cd scientific-calculator
```

### **2. Build the Java Application**
```bash
javac -d . src/com/aman/ScientificCalculator.java
jar -cvf ScientificCalculator.jar -C . com
```

### **3. Run Locally (Without Docker)**
```bash
java -jar ScientificCalculator.jar
```

---

## Docker Setup

### **1. Build Docker Image**
```bash
docker build -t amanbh321/scientific-calculator:v3 .
```

### **2. Run Docker Container**
```bash
docker run -d --name scientific-calculator -p 9090:8080 amanbh321/scientific-calculator:v3
```

### **3. Check Running Container**
```bash
docker ps
```

### **4. View Logs**
```bash
docker logs scientific-calculator
```

---

## Ansible Deployment

### **1. Run Ansible Playbook**
```bash
ansible-playbook deploy.yml
```

This will:
- Start the Docker service
- Pull the latest Docker image
- Stop any existing container
- Deploy the updated version

---

## CI/CD Pipeline with Jenkins
If Jenkins is configured, the following happens on **git push**:
1. **Jenkins Pulls Latest Code**
2. **Builds Docker Image**
3. **Pushes to DockerHub**
4. **Deploys using Ansible**

---

## How to Demonstrate the Project
### **1. Running the Calculator in Docker**
```bash
docker exec -it scientific-calculator /bin/bash
java -jar /app/ScientificCalculator.jar
```

### **2. Access the Web App (If applicable)**
```
http://localhost:9090
```

### **3. Stop and Remove Containers After Demo**
```bash
docker stop scientific-calculator
docker rm scientific-calculator
```

---

## Troubleshooting
### **Check Docker Logs for Errors**
```bash
docker logs scientific-calculator
```

### **Restart Docker Service**
```bash
sudo systemctl restart docker
```

### **Rebuild & Redeploy If Issues Persist**
```bash
docker rm -f scientific-calculator
docker rmi amanbh321/scientific-calculator:v3
docker build -t amanbh321/scientific-calculator:v3 .
docker run -d -p 9090:8080 amanbh321/scientific-calculator:v3
```

---

## Author
**Aman Bahuguna**
- GitHub: [amanbh321](https://github.com/amanbh321)
- DockerHub: [amanbh321](https://hub.docker.com/u/amanbh321)

---

