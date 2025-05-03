# Event Registration System

A web-based application for managing event registrations, built using Spring Boot, Thymeleaf, and MySQL. This system allows administrators to create and manage events while users can register, view details, and manage their participation efficiently.

## Features

- Admin login and dashboard
- Create, update, and delete events
- View registered users for events
- User registration and login
- Register for available events
- Responsive user interface

## Tech Stack

- Java 11
- Spring Boot
- Spring Data JPA
- Thymeleaf
- MySQL
- Bootstrap

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/gpta/event/   # Update if refactored
│   │       ├── controller/
│   │       ├── dto/
│   │       ├── entity/
│   │       ├── repo/
│   │       ├── service/
│   │       └── EventRegistrationApplication.java
│   └── resources/
│       ├── templates/
│       ├── static/
│       └── application.properties
```

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/Gupta2501/event-registration-system.git
   ```

2. Set up your MySQL database and update `application.properties`

3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Visit `http://localhost:8080` in your browser

## Default Roles

- Admin can create/manage events
- Users can register and view events

## 📝 License

This project is open for learning and personal portfolio use.
