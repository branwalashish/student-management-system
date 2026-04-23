# 📘 Student Management System

A simple **Spring Boot-based web application** to manage student records, built using **Java, Spring Boot, JPA/Hibernate, MySQL, and Thymeleaf**.

---

## 🚀 Overview

This project demonstrates a basic **CRUD (Create, Read, Update, Delete)** application following **MVC architecture**.

It allows users to:

* Add new students
* View all student records
* Update existing student details
* Delete student records

The application integrates with a **MySQL database** and uses **Thymeleaf** for server-side rendering.

---

## 🛠️ Tech Stack

* **Backend:** Java, Spring Boot
* **ORM:** Spring Data JPA (Hibernate)
* **Database:** MySQL
* **Frontend:** Thymeleaf
* **Build Tool:** Maven
* **Version Control:** Git & GitHub

---

## 🏗️ Architecture

The project follows a layered architecture:

Controller → Service → Repository → Database

* **Controller:** Handles HTTP requests and responses
* **Service:** Contains business logic
* **Repository:** Handles database operations using JPA
* **Entity:** Represents database tables

---

## ⚙️ Features

* Full CRUD operations
* MVC design pattern
* Database integration using JPA
* Server-side rendering using Thymeleaf
* Clean and modular code structure

---

## 🗄️ Database Configuration

Update the following properties in:

`src/main/resources/application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
```

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/student-management-system.git
   ```

2. Navigate to the project folder:

   ```bash
   cd student-management-system
   ```

3. Run the application:

   ```bash
   mvn spring-boot:run
   ```

4. Open in browser:

   ```
   http://localhost:8080/students
   ```

---

## 📌 Key Learnings

* Implementation of MVC architecture in Spring Boot
* Integration of MySQL with JPA/Hibernate
* Handling CRUD operations efficiently
* Structuring a clean backend application
* Managing project versioning using Git

---

## 🔮 Future Improvements

* Add REST API support
* Implement validation and exception handling
* Add pagination and search functionality
* Improve UI using modern frontend frameworks

---

## 👤 Author

**Ashish Kumar**
