# Command Line Application

## Overview
This is a simple Java command-line application that prints the name of the company (`impact.com`). It demonstrates how to build a CLI tool using Picocli, handle command-line options like `--help`, and package the application into a runnable JAR with Maven.

## Features
- `--help` : displays usage information and available options
- `--version` : shows the version of the CLI
- Prints the company name to the terminal

## Technologies Used
- Java 17
- Picocli 4.7.5
- JUnit 5.10.0 for testing
- Maven for build and dependency management

## Project Structure

src/
├── main/
│   ├── java/com/william/
│   │   ├── GenerateName.java
├── test/
│   ├── java/com/william/
|   |   ├── GenerateNameTest.java

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/WillPrell/impact.com_repo
   cd impact.com_repo
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   java -jar target/william-1.0-SNAPSHOT.jar
   ```

## Running Tests
To run unit tests, execute:
```bash
mvn test
```
