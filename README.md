Employee Management System

A Spring Boot based backend project for managing employee records using REST APIs and MySQL database.

---

🚀 Features

- Add new employee
- Get all employees
- Get employee by ID
- Update employee details
- Delete employee
- Exception Handling

---

🛠️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- REST APIs
- Postman

---

🏗️ Project Structure

- Controller → Handles API requests
- Service → Business logic
- Repository → Database operations
- Entity → Database table mapping
- Exception → Custom exception handling

---

⚙️ How to Run the Project

1. Clone the repository
2. Open in IntelliJ IDEA / Eclipse
3. Configure MySQL database in "application.properties"
4. Run the Spring Boot application
5. Use Postman to test APIs

---

🗄️ Database Configuration

spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

---

📌 API Endpoints

- POST /employees → Add employee
- GET /employees → Get all employees
- GET /employees/{id} → Get employee by ID
- PUT /employees/{id} → Update employee
- DELETE /employees/{id} → Delete employee
