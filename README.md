# Company Database Management System - Spring Boot

This project is a Spring Boot application built to manage a company's organizational structure based on the **"Company" database** schema. It provides CRUD operations for entities such as Employees, Departments, Projects, and Dependents, while managing relationships like the assignment of employees to projects.

## Features

- **Employee Management**: Add, update, delete, and view employee details.
- **Department Management**: Manage departments within the company.
- **Project Management**: Track projects and assign employees to them.
- **Works_On Relationship**: Manage employee assignments to projects.
- **Dependent Management**: Handle employee dependents' information.
- **RESTful API**: Expose CRUD endpoints for all entities.
  
## Tech Stack

- **Java**: Spring Boot, Spring Data JPA, Hibernate
- **Database**: MySQL (Company database schema)
- **Build Tool**: Maven
- **ORM**: JPA/Hibernate for database interactions
- **API**: RESTful APIs using Spring Boot

## Database Schema

The project uses the following tables from the Company database:

- **Employee**: Stores employee details.
- **Department**: Stores department information.
- **Project**: Tracks projects within the company.
- **Works_On**: Maps employee assignments to projects.
- **Dependent**: Manages employees' dependents.

## Setup Instructions

### Prerequisites
- Java 17 or above
- Maven
- MySQL

### Steps to Run

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/company-database-management.git
    cd company-database-management
    ```

2. **Configure the Database**:
    - Create a MySQL database called `company`.
    - Update the `application.properties` file in `src/main/resources` with your MySQL credentials:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/company
      spring.datasource.username=yourUsername
      spring.datasource.password=yourPassword
      spring.jpa.hibernate.ddl-auto=update
      ```

3. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

4. **Access the API**:
    The application will be running at `http://localhost:8080`. You can access the available endpoints through a tool like Postman or your web browser.

## Endpoints

- `GET /employees`: Retrieve all employees
- `POST /employees`: Add a new employee
- `PUT /employees/{id}`: Update an existing employee
- `DELETE /employees/{id}`: Delete an employee
- Similar endpoints are available for departments, projects, and dependents.

