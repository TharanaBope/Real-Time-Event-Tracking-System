
# Real Time Event Tracking System

This project is a comprehensive Event Tracking System designed to streamline event management and tracking. The system is divided into two key components:

1. **Frontend**: A modern and responsive user interface built with JavaScript and Vite.
2. **Backend**: A robust backend application developed using Spring Boot to handle data processing and API management.

This documentation provides an in-depth overview of the project, its features, installation steps, and structure.

---

## Project Features

### Frontend
- Interactive and intuitive user interface for event tracking.
- Component-based design for modular development.
- Responsive design for various screen sizes.
- Seamless integration with backend APIs.

### Backend
- RESTful APIs for CRUD operations.
- Modular design following object-oriented principles.
- Robust logging and simulation capabilities.
- Database integration for persistent data storage.

---

## Technology Stack

### Frontend
- **Framework**: Vite
- **Language**: JavaScript
- **Tools**: Node.js, ESLint

### Backend
- **Framework**: Spring Boot
- **Language**: Java
- **Build Tool**: Maven
- **Database**: (Specify if known, e.g., MySQL/PostgreSQL)

---

## Project Structure

### Frontend
```
event_tracking_system/
├── index.html            # Main HTML file
├── package.json          # Dependencies and scripts
├── vite.config.js        # Vite configuration
├── public/               # Static assets
├── src/                  # Source code
│   ├── assets/           # Application assets
│   ├── components/       # Reusable UI components
│   ├── pages/            # Application pages
│   ├── App.js            # Root application file
│   ├── main.js           # Application entry point
```

### Backend
```
oop_Backend/
├── pom.xml               # Maven project descriptor
├── src/                  # Source code
│   ├── main/
│   │   ├── java/         # Java files
│   │   │   └── com.tharana.oop_backend/
│   │   │       ├── OopBackendApplication.java  # Main application class
│   │   │       ├── controller/                # API Controllers
│   │   │       │   ├── DefaultController.java
│   │   │       │   ├── LogController.java
│   │   │       │   ├── SimulationController.java
│   │   │       │   ├── TicketController.java
│   ├── test/             # Test files
```

---

## Installation and Setup

### Prerequisites
- **Node.js**: Version 16 or higher (for frontend).
- **Java**: Version 11 or higher (for backend).
- **Maven**: To build the backend.

### Frontend Setup

1. Clone the frontend repository:
   ```bash
   git clone https://github.com/your-frontend-repo.git
   cd event_tracking_system
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Start the development server:
   ```bash
   npm run dev
   ```

4. Access the app at [http://localhost:3000](http://localhost:3000).

5. To build for production:
   ```bash
   npm run build
   ```

### Backend Setup

1. Clone the backend repository:
   ```bash
   git clone https://github.com/your-backend-repo.git
   cd oop_Backend
   ```

2. Build the backend:
   ```bash
   ./mvnw clean install
   ```

3. Run the backend server:
   ```bash
   ./mvnw spring-boot:run
   ```

4. The backend will run at [http://localhost:8080](http://localhost:8080).

---

## API Endpoints

### Frontend
- The frontend interacts with the backend via HTTP requests to retrieve or update event data.

### Backend
- **Base URL**: `http://localhost:8080`
- **Endpoints**:
  - `/default`: Handles default operations.
  - `/log`: Manages logs.
  - `/simulation`: Controls simulation processes.
  - `/ticket`: Manages ticket-related functionality.

---

## Development Workflow

1. **Frontend**:
   - Develop UI components in the `components` directory.
   - Link pages via the router in the `pages` directory.
   - Ensure proper state management for data flow.

2. **Backend**:
   - Add new endpoints in the `controller` package.
   - Implement business logic in the `service` layer (if applicable).
   - Write unit tests for every new feature in the `test` directory.

---

## Deployment

1. **Frontend**:
   - Build the project:
     ```bash
     npm run build
     ```
   - Deploy the `dist` folder to your hosting provider.

2. **Backend**:
   - Package the application:
     ```bash
     ./mvnw package
     ```
   - Deploy the generated `.jar` file to your server.

---

## Contribution Guidelines

1. Fork the repositories.
2. Create a branch for your feature or bugfix:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes and push to the branch:
   ```bash
   git push origin feature-name
   ```
4. Open a pull request and describe your changes.

---

## License

This project is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute this project as per the license terms.

---

## Contact

For any queries or contributions, reach out to:
- **Project Owner**: Tharana Bopearachchi
- **Email**: tharanabope30@gmail.com
- **GitHub**: [your-github-profile]([https://github.com/your-github-profile](https://github.com/TharanaBope))

---

