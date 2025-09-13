🎟️ Ticket Booking System

⚡ A full-stack ticket booking platform built with Spring Boot REST APIs and a Spring Boot Web Client.
Designed for real-world scalability, security, and user experience.

🏗️ System Architecture
   [ Web Client (Spring Boot) ]  --->  [ Ticket Booking API ]  --->  [ Database ]
             ↑                                ↓                          ↓
         User UI                      Booking Logic              Persistent Data

🚀 Tech Stack
🔹 Backend (TicketBookingApi)

Java 17

Spring Boot 3+

Spring Data JPA / MongoDB (Database integration)

Spring Mail (Gmail SMTP configuration for sending booking confirmations)

Spring Security (basic authentication & validation)

Swagger / OpenAPI Documentation

Lombok for boilerplate reduction

Maven for build

🔹 Frontend (WebClient)

Spring Boot Web (Thymeleaf / REST Client)

HTML, CSS, JavaScript (if included for UI)

REST API consumption from backend

✨ Features
✅ Core Features

🎫 Ticket Booking → Create, update, and cancel bookings

👤 User Management → Register & manage users

📊 Ticket Availability → Check available tickets in real-time

✅ Additional Features

📧 Gmail SMTP integration → Sends confirmation emails to users

🔒 Spring Security (Basic Authentication + Input Validation) → Protects sensitive endpoints

🌐 Swagger UI → Auto-generated API documentation

🛠️ Database Connection → Fully configured MongoDB / MySQL connection

🖥️ Web Client Integration → Frontend communicates with backend API seamlessly

🔥 API Endpoints (Sample)
🎫 Booking API
POST   /api/bookings        # Create new booking  
GET    /api/bookings/{id}   # Fetch booking by ID  
DELETE /api/bookings/{id}   # Cancel booking  

👤 User API
POST   /api/users           # Register new user  
GET    /api/users/{id}      # Fetch user details  

📧 Email API (Gmail)
POST   /api/notifications/sendMail   # Sends booking confirmation  

⚡ Getting Started
1️⃣ Run the Backend (API)
git clone https://github.com/your-username/TicketBookingApi.git
cd TicketBookingApi
mvn clean install
mvn spring-boot:run


API runs at 👉 http://localhost:8080

Swagger Docs 👉 http://localhost:8080/swagger-ui.html

2️⃣ Run the Client
git clone https://github.com/your-username/WebClient.git
cd WebClient
mvn clean install
mvn spring-boot:run


Web Client runs at 👉 http://localhost:8081

🏆 Why This Project Stands Out

🔥 Gmail SMTP integration for real-time confirmations
🔥 Basic Spring Security already in place (scalable for JWT in future)
🔥 Swagger Documentation for professional API usage
🔥 Database connection fully configured (MongoDB / MySQL)
🔥 Client & API separated → Follows microservice-ready structure
🔥 Extensible design → Easy to add payments, roles, dashboards
