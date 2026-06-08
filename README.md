# Favourite Quotes

A Spring Boot REST API application for saving and managing your favourite quotes. Built with Java and Gradle, this application provides endpoints to store and retrieve meaningful quotes with ease.

## Overview

Favourite Quotes is a lightweight Java-based web service that allows users to save, manage, and retrieve their favourite quotes. The application is built using the Spring Boot framework and uses JPA with H2/MySQL database support for data persistence.

## Technology Stack

- **Java 11** - Programming language
- **Spring Boot 2.5.3** - Web framework
- **Spring Data JPA** - Database abstraction layer
- **Lombok** - Reduce boilerplate code
- **H2 Database** - Default embedded database
- **MySQL** - Optional database support
- **Gradle** - Build automation tool
- **JUnit** - Testing framework

## Prerequisites

- Java 11 or higher
- Gradle 6.x or higher (or use the provided Gradle wrapper)

## Building From Source

### On Linux/macOS:
```bash
./gradlew build
```

### On Windows:
```bash
gradlew build
```

### Building without tests:

**Linux/macOS:**
```bash
./gradlew build -x test
```

**Windows:**
```bash
gradlew build -x test
```

## Running the Application

### On Linux/macOS:
```bash
./gradlew bootRun --args="--server.port=9000"
```

### On Windows:
```bash
gradlew bootRun --args="--server.port=9000"
```

The application will start on `http://localhost:9000`

## API Endpoints

### Save a Favourite Quote
- **Endpoint:** `POST /quote`
- **URL:** `http://localhost:9000/quote`
- **Description:** Save a new favourite quote to the database

**Example Request:**
```json
{
  "text": "The only way to do great work is to love what you do.",
  "author": "Steve Jobs"
}
```

## Project Structure

```
favourite-quotes/
├── src/
│   ├── main/          # Main application code
│   └── test/          # Unit and integration tests
├── gradle/            # Gradle wrapper files
├── build.gradle       # Build configuration
├── settings.gradle    # Gradle settings
├── Jenkinsfile        # CI/CD pipeline configuration
└── README.md          # This file
```

## Configuration

The application uses Spring Boot's default configuration. You can customize settings via:

- **Environment variables**
- **Command-line arguments**
- **Application properties file** (if created)

### Example: Changing the port
```bash
./gradlew bootRun --args="--server.port=8080"
```

## Database

By default, the application uses an **H2 embedded database** for quick development and testing. 

To switch to **MySQL**:
1. Add MySQL configuration to your `application.properties` or `application.yml`
2. Ensure MySQL server is running
3. Update the connection properties as needed

## Testing

Run the test suite:

**Linux/macOS:**
```bash
./gradlew test
```

**Windows:**
```bash
gradlew test
```

## CI/CD

This project includes a **Jenkinsfile** for continuous integration and deployment. The pipeline can automatically build and test the application on each commit.

## Contributing

Feel free to fork this repository and submit pull requests for any improvements or bug fixes.

## License

This project is open source and available under the MIT License.

## Support

For issues or questions, please open an issue on the GitHub repository.

---

Happy quoting! 💬✨
