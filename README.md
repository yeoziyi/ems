# Employee Management System (EMS)

Employee Management System (EMS) is a RESTful API for managing employee data.

## Table of Contents

- [Project Setup](#project-setup)
- [API Endpoints](#api-endpoints)
- [Authentication](#authentication)

## Project Setup
1. Open web browser and use Spring Initializr to create project, Select "Spring Boot Version".
2. Choose your desired "Language" (Java or Kotlin).
3. Add "Dependencies" based on your project requirements (e.g., Web, Security, Data JPA, etc.).
4. Other "Dependencies" can be added in pom.xml file.

## API Endpoint
Employees
GET /api/employees: Retrieve a list of all employees.
GET /api/employees/{id}: Retrieve employee details by ID.
POST /api/employees: Create a new employee.
PUT /api/employees/{id}: Update employee details by ID.
DELETE /api/employees/{id}: Delete an employee by ID.

Department Endpoints:
GET /api/departments: Get a list of all departments.
GET /api/departments/{id}: Get details of a specific department by ID.
POST /api/departments: Create a new department.
Request Body: { "name": "Engineering", "description": "Software Development Department" }
PUT /api/departments/{id}: Update details of an existing department.
Request Body: { "name": "Product Management", "description": "Product Strategy Department" }
DELETE /api/departments/{id}: Delete a department by ID.

Swagger Documentation Endpoints:
GET /v3/api-docs: Get the OpenAPI documentation in JSON format.
GET /swagger-ui/: Access the Swagger UI for interactive API documentation.

Authentication Endpoints:
POST /api/auth/signup: Create a new user account.
Request Body: { "username": "example", "password": "example" }
POST /api/auth/login: Login to the system and obtain an access token.
Request Body: { "username": "example", "password": "example" }
Response: { "accessToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..." }

## Authentication
Authentication is implemented using JSON Web Tokens (JWT). Follow these steps to authenticate:
1. Register a new user:
Endpoint: POST /api/auth/register
Request Body: JSON object containing username and password.
Example: { "username": "user", "password": "password" }

3. Obtain an access token:
Endpoint: POST /api/auth/login
Request Body: JSON object containing username and password.
Example: { "username": "user", "password": "password" }
Response: JSON object containing access token.

3. Use the access token for authenticated requests:
Include the access token in the Authorization header of your requests:
Authorization: Bearer <access_token>

4. curl -X GET http://localhost:8080/api/employees \
-H "Authorization: Bearer <access_token>"

