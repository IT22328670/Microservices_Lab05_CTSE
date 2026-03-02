# Microservices Lab – SE4010

## Overview

This project implements a complete Microservices architecture using:

- Spring Boot
- Spring Cloud Gateway
- Docker
- Docker Compose

The system consists of 4 independent services:

- Item Service
- Order Service
- Payment Service
- API Gateway

All services are containerized and communicate through the API Gateway.

---

## System Architecture

Client → API Gateway (Port 8080) → Microservices

| Service | Port |
|----------|--------|
| Item Service | 8081 |
| Order Service | 8082 |
| Payment Service | 8083 |
| API Gateway | 8080 |

All client requests go through the API Gateway.

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Cloud Gateway
- Maven
- Docker
- Docker Compose
- Postman (for testing)

---

## How to Run the Project

### Option 1 – Using Docker (Recommended)

From the root folder:
docker compose build
docker compose up


Then access:


http://localhost:8080/items

http://localhost:8080/orders

http://localhost:8080/payments


---

### Option 2 – Run from IntelliJ

1. Run ItemServiceApplication
2. Run OrderServiceApplication
3. Run PaymentServiceApplication
4. Run ApiGatewayApplication

Then test using port 8080.

---

## API Endpoints

### Item Service
- GET /items
- POST /items
- GET /items/{id}

### Order Service
- GET /orders
- POST /orders
- GET /orders/{id}

### Payment Service
- GET /payments
- POST /payments/process
- GET /payments/{id}

All endpoints must be accessed via:


http://localhost:8080


---

## Screenshots

All API testing screenshots are available inside the `screenshots` folder.

They demonstrate:

- Docker running containers
- Successful GET requests
- Successful POST requests
- Gateway routing working correctly

---

## Author

Student Name: C M S R D MORAYES - IT22328670 
Module: SE4010 – Current Trends in Software Engineering  
Year: 2026