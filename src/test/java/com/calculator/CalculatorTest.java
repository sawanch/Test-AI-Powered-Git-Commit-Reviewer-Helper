package com.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Calculator class.
 */
@DisplayName("Calculator Test Suite")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Addition should return the sum of two numbers")
    void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0));
        assertEquals(0.0, calculator.add(-5.0, 5.0));
        assertEquals(-10.0, calculator.add(-5.0, -5.0));
        assertEquals(7.5, calculator.add(3.5, 4.0));
    }

    @Test
    @DisplayName("Subtraction should return the difference of two numbers")
    void testSubtract() {
        assertEquals(1.0, calculator.subtract(3.0, 2.0));
        assertEquals(-10.0, calculator.subtract(-5.0, 5.0));
        assertEquals(0.0, calculator.subtract(5.0, 5.0));
        assertEquals(2.5, calculator.subtract(5.0, 2.5));
    }

    @Test
    @DisplayName("Multiplication should return the product of two numbers")
    void testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0));
        assertEquals(-15.0, calculator.multiply(-5.0, 3.0));
        assertEquals(25.0, calculator.multiply(5.0, 5.0));
        assertEquals(0.0, calculator.multiply(5.0, 0.0));
    }

    @Test
    @DisplayName("Division should return the quotient of two numbers")
    void testDivide() {
        assertEquals(2.0, calculator.divide(6.0, 3.0));
        assertEquals(-2.5, calculator.divide(-5.0, 2.0));
        assertEquals(1.0, calculator.divide(5.0, 5.0));
        assertEquals(2.5, calculator.divide(5.0, 2.0));
    }

    @Test
    @DisplayName("Division by zero should throw ArithmeticException")
    void testDivideByZero() {
        ArithmeticException exception = assertThrows(
            ArithmeticException.class,
            () -> calculator.divide(5.0, 0.0)
        );
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    @DisplayName("Power should calculate base raised to exponent")
    void testPower() {
        assertEquals(8.0, calculator.power(2.0, 3.0));
        assertEquals(1.0, calculator.power(5.0, 0.0));
        assertEquals(0.5, calculator.power(2.0, -1.0));
        assertEquals(25.0, calculator.power(5.0, 2.0));
    }

    @Test
    @DisplayName("Square root should calculate the square root of a number")
    void testSquareRoot() {
        assertEquals(3.0, calculator.squareRoot(9.0));
        assertEquals(5.0, calculator.squareRoot(25.0));
        assertEquals(0.0, calculator.squareRoot(0.0));
        assertEquals(10.0, calculator.squareRoot(100.0));
    }

    @Test
    @DisplayName("Square root of negative number should throw ArithmeticException")
    void testSquareRootNegative() {
        ArithmeticException exception = assertThrows(
            ArithmeticException.class,
            () -> calculator.squareRoot(-1.0)
        );
        assertEquals("Cannot calculate square root of negative number", exception.getMessage());
    }

    @Test
    @DisplayName("Percentage should calculate the percentage of a number")
    void testPercentage() {
        assertEquals(50.0, calculator.percentage(200.0, 25.0));
        assertEquals(10.0, calculator.percentage(100.0, 10.0));
        assertEquals(0.0, calculator.percentage(100.0, 0.0));
        assertEquals(75.0, calculator.percentage(150.0, 50.0));
    }

    @Test
    @DisplayName("Addition with large numbers")
    void testAddLargeNumbers() {
        assertEquals(2000000.0, calculator.add(1000000.0, 1000000.0));
    }

    @Test
    @DisplayName("Multiplication with decimal precision")
    void testMultiplyDecimals() {
        double result = calculator.multiply(0.1, 0.2);
        assertEquals(0.02, result, 0.001);
    }
}

