# Spring Boot REST API with PostgreSQL

A full-stack backend application built with Spring Boot that provides REST API endpoints for managing software engineers. The application uses PostgreSQL as the database with Docker containerization for easy development and deployment.

## 🎯 Project Overview

This is a complete REST API application that demonstrates modern Spring Boot development practices including:

- RESTful API design with proper HTTP methods and status codes
- Layered architecture with separation of concerns (Controller → Service → Repository)
- JPA/Hibernate for database operations and entity mapping
- Docker containerization for database management
- Comprehensive CRUD operations with error handling

## 🛠 Technologies Used

- **Spring Boot** - Main framework for building the application
- **Java 21** - Programming language and runtime
- **Spring Data JPA** - Data access and persistence layer
- **PostgreSQL** - Relational database
- **Docker & Docker Compose** - Database containerization
- **Maven** - Dependency management and build tool

## 🚀 Getting Started

### Prerequisites

- Java 21 or later
- Docker and Docker Desktop
- Maven (or use included wrapper)

### Installation & Setup

1. **Clone the repository**
   ```bash
   git clone <your-repository-url>
   cd spring-boot-REST-API
   ```

2. **Start the PostgreSQL database**
   ```bash
   docker-compose up -d
   ```

3. **Run the Spring Boot application**
   ```bash
   ./mvnw spring-boot:run
   ```
   Or on Windows:
   ```bash
   mvnw.cmd spring-boot:run
   ```

4. **Test the API**
    - The application runs on `http://localhost:8080`
    - Use the included `requests.http` file for testing endpoints

## 📋 API Endpoints

### Software Engineers Management

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/v1/software-engineers` | Retrieve all software engineers |
| GET | `/api/v1/software-engineers/{id}` | Get a software engineer by ID |
| POST | `/api/v1/software-engineers` | Create a new software engineer |

### Example Requests

**Get all software engineers:**
```http
GET http://localhost:8080/api/v1/software-engineers
```

**Get software engineer by ID:**
```http
GET http://localhost:8080/api/v1/software-engineers/1
```

**Create new software engineer:**
```http
POST http://localhost:8080/api/v1/software-engineers
Content-Type: application/json

{
  "name": "John Doe",
  "techStack": "Java, Spring Boot, React"
}
```

## 🗄️ Database Configuration

The application uses PostgreSQL running in a Docker container:

- **Host**: localhost
- **Port**: 5412 (mapped from container port 5432)
- **Database**: postgres
- **Username**: my_username🧐
- **Password**: my_password🙈🔐

Database tables are automatically created using JPA annotations and Hibernate DDL auto-generation.

## 🏗️ Project Structure

```
spring-boot-REST-API/
├── docker-compose.yml              # PostgreSQL container configuration
├── pom.xml                         # Maven dependencies and build configuration
├── requests.http                   # HTTP request examples for testing
├── src/
│   ├── main/
│   │   ├── java/com/kipruto/
│   │   │   ├── SoftwareEngineer.java          # JPA Entity
│   │   │   ├── SoftwareEngineerRepository.java # Data Access Layer
│   │   │   ├── SoftwareEngineerService.java    # Business Logic Layer
│   │   │   ├── SoftwareEngineerController.java # REST Controller
│   │   │   └── SpringBootRestApiApplication.java # Main Application Class
│   │   └── resources/
│   │       ├── application.properties         # Database and app configuration
│   │       ├── static/                       # Static web assets
│   │       └── templates/                    # Template files
│   └── test/
│       └── java/com/kipruto/
│           └── SpringBootRestApiApplicationTests.java # Unit tests
├── target/                         # Compiled classes and build artifacts
├── mvnw                           # Maven wrapper script (Unix)
└── mvnw.cmd                       # Maven wrapper script (Windows)
```

## 🏛️ Architecture

The application follows a layered architecture pattern:

- **Controller Layer** (`SoftwareEngineerController`): Handles HTTP requests and responses
- **Service Layer** (`SoftwareEngineerService`): Contains business logic and validation
- **Repository Layer** (`SoftwareEngineerRepository`): Data access abstraction using Spring Data JPA
- **Entity Layer** (`SoftwareEngineer`): JPA entity representing the data model

## 🐳 Docker Setup

The project includes Docker Compose configuration for PostgreSQL:

- Persistent data storage with Docker volumes
- Custom port mapping (5431:5432) to avoid conflicts
- Automatic restart policies
- Network isolation for security

**Start the database:**
```bash
docker-compose up -d
```

**Stop the database:**
```bash
docker-compose down
```

**View logs:**
```bash
docker-compose logs db
```

## 🧪 Testing

The project includes:

- Unit tests for the main application context
- HTTP request examples in `requests.http` for manual API testing
- Automatic table creation and validation

Run tests with:
```bash
./mvnw test
```

## 🔧 Configuration

Key configuration in `application.properties`:

- Database connection settings
- JPA/Hibernate configuration
- Server port and context settings
- Logging levels

## 🚀 Features

- **CRUD Operations**: Complete Create, Read, Update, Delete functionality
- **Error Handling**: Proper exception handling with meaningful error messages
- **Data Validation**: Input validation and constraint checking
- **Auto-generated IDs**: Database-managed primary key generation
- **RESTful Design**: Following REST principles and HTTP standards
- **Dockerized Database**: Easy development setup with containerized PostgreSQL

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests if applicable
5. Submit a pull request