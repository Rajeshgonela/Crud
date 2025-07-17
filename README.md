# User CRUD API

A fully functional RESTful API built using **Spring Boot** and **PostgreSQL** to perform CRUD (Create, Read, Update, Delete) operations on user data.

🔗 [Live Swagger UI](https://crud-2-rfkn.onrender.com/)  
📦 Hosted on [Render](https://render.com/)  
💻 Developed by Rajesh

---

## 🚀 Features

- Create, Read, Update, and Delete users via RESTful endpoints
- Swagger UI integration for easy testing and documentation
- Cloud-hosted PostgreSQL database for persistent storage
- Clean and modular architecture following best practices
- Deployed and accessible via public API endpoints

---

## 🧱 Tech Stack

- **Backend:** Spring Boot
- **Database:** PostgreSQL (hosted on Render)
- **Documentation:** Swagger UI
- **Build Tool:** Maven
- **Hosting:** Render

---

## 📂 Project Structure

```bash
├── src
│   ├── main
│   │   ├── java/com/project/crud
│   │   │   ├── controller
│   │   │   ├── dto
│   │   │   ├── model
│   │   │   ├── repository
│   │   │   ├── service
│   │   │   └── CrudApplication.java
│   │   └── resources
│   │       ├── application.properties
├── pom.xml
└── README.md

## 🚀 How to Run Locally

### ✅ Prerequisites

- Java 17+
- Maven
- PostgreSQL (running locally)

1. Clone the Repository
git clone https://github.com/Rajeshgonela/Crud.git
cd Crud

2. Set Up PostgreSQL Database
Ensure PostgreSQL is installed and running.
Create a database named user_crud (or your preferred name):

3.Update application.properties
Edit the file:
src/main/resources/application.properties

properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/user_crud
spring.datasource.username=YOUR_DB_USERNAME
spring.datasource.password=YOUR_DB_PASSWORD
spring.jpa.hibernate.ddl-auto=update

4.Build and Run the Application
mvn clean install
mvn spring-boot:run

5.Access Swagger UI
Once the app is running, go to:
http://localhost:8080/swagger-ui/index.html




