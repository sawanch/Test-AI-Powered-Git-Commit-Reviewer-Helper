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
- Average calculation
- Factorial calculation

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

## Features

- Addition
- Subtraction
- Multiplication
- Division
- Power calculation
- Square root
- Percentage calculation
- Average calculation
- Factorial calculation

## Usage

The calculator now includes a power operation, an average calculation, and a factorial calculation. You can use the following methods:

- **Power**: `power(base, exponent)` to calculate exponentiation.
  ```java
  double result = calc.power(2, 3); // result will be 8.0
  ```

- **Average**: `average(numbers...)` to calculate the average of a set of numbers.
  ```java
  double avg = calc.average(10, 20, 30, 40, 50); // avg will be 30.0
  ```

- **Factorial**: `factorial(n)` to calculate the factorial of a non-negative integer.
  ```java
  long fact = calc.factorial(5); // fact will be 120
  ```

## License

This is a test project for educational purposes.

## Features / Changelog
- **2026-01-06 18:42**: feat: add average and factorial methods to Calculator class
- **2026-01-06 15:00**: feat: add power operation to Calculator
- **2026-01-07 10:00**: feat: add average and factorial methods to Calculator class
  - Implemented average method to calculate the average of a set of numbers
  - Added factorial method for non-negative integers with error handling
  - Updated main method to demonstrate new functionalities
