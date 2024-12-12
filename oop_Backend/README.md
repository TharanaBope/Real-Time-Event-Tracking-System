
# OOP Backend

This is a backend application implemented in Java using the Spring Boot framework. It serves as the core backend for managing and processing data for an object-oriented programming project.

## Features

- RESTful API endpoints for various operations.
- Modular design with separate controllers for specific functionalities.
- Maven build system for dependency management.
- Follows object-oriented principles and design patterns.

## Project Structure

```
oop_Backend/
├── .gitattributes
├── .gitignore
├── .idea/                  # IntelliJ IDEA project configuration files
├── .mvn/                   # Maven wrapper files
├── HELP.md                 # Additional project guidance
├── mvnw, mvnw.cmd          # Maven wrapper scripts
├── pom.xml                 # Maven project descriptor
├── src/                    # Source code
│   ├── main/
│   │   ├── java/           # Java source files
│   │   │   └── com.tharana.oop_backend/
│   │   │       ├── OopBackendApplication.java  # Main application class
│   │   │       ├── controller/
│   │   │           ├── DefaultController.java
│   │   │           ├── LogController.java
│   │   │           ├── SimulationController.java
│   │   │           ├── TicketController.java
│   ├── test/               # Unit and integration tests
├── target/                 # Build output directory
```

## Prerequisites

- **Java**: Version 11 or higher.
- **Maven**: Ensure Maven is installed for dependency management.

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/your-repository.git
   ```

2. Navigate to the project directory:
   ```bash
   cd oop_Backend
   ```

3. Build the project using Maven:
   ```bash
   ./mvnw clean install
   ```

4. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

## API Endpoints

- **Base URL**: `http://localhost:8080`
- **Endpoints**:
  - `/default`: Handles default operations.
  - `/log`: Manages logs.
  - `/simulation`: Controls simulation processes.
  - `/ticket`: Manages ticket-related functionality.

## Contributing

Contributions are welcome! Please fork this repository and submit a pull request with your changes.

## License

This project is licensed under the [MIT License](LICENSE).
