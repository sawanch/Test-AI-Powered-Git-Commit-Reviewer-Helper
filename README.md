# Test-AI-Powered-Git-Commit-Reviewer-Helper

A simple Maven-based Java calculator library designed to test the **AI-Powered-Git-Commit-Reviewer** project and its functionalities.

## Overview

This project contains a basic calculator implementation with the following features:
- Addition
- Subtraction
- Multiplication
- Division
- Power calculation
- Square root
- Percentage calculation

This is intentionally kept simple as a helper project to generate meaningful commits for testing the AI-Powered-Git-Commit-Reviewer.

## Project Structure

```
Test-AI-Powered-Git-Commit-Reviewer-Helper/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── calculator/
│   │               └── Calculator.java          # Core calculator logic
│   └── test/
│       └── java/
│           └── com/
│               └── calculator/
│                   └── CalculatorTest.java      # Unit tests
└── README.md
```

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

## Building and Running

To build and run the calculator demo:

```bash
mvn clean package
java -jar target/simple-calculator-1.0.0.jar
```

Or run directly with Maven:

```bash
mvn compile exec:java -Dexec.mainClass="com.calculator.Calculator"
```

To run tests:

```bash
mvn test
```

## Purpose: Testing AI-Powered-Git-Commit-Reviewer

This project serves as a test repository for the AI-Powered-Git-Commit-Reviewer. Make commits to test:

- **Code review suggestions** - AI analysis of your code changes
- **Security validation** - Detection of vulnerabilities or bad practices
- **README generation** - Automatic documentation updates
- **Slack notifications** - Alert functionality (if configured)

## Sample Test Scenarios

**Scenario 1: Add a new operation**  
Add a new method like `modulo()` or `factorial()` to `Calculator.java`

**Scenario 2: Introduce a bug**  
Remove the zero-check from `divide()` method to test security scanning

**Scenario 3: Fix the bug**  
Restore the validation to test bug fix detection

**Scenario 4: Update documentation**  
Modify or improve JavaDoc comments

**Scenario 5: Add more tests**  
Expand `CalculatorTest.java` with additional test cases

**Scenario 6: Refactor code**  
Rename methods, extract helper functions, improve code structure

## License

This is a test project for educational purposes.
