package com.calculator;

/**
 * A simple calculator class that performs basic arithmetic operations.
 */
public class Calculator {

    /**
     * Adds two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first.
     *
     * @param a the first number
     * @param b the second number
     * @return the difference of a and b
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of a and b
     * @throws ArithmeticException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * Calculates the power of a number.
     *
     * @param base     the base number
     * @param exponent the exponent
     * @return base raised to the power of exponent
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Calculates the square root of a number.
     *
     * @param number the number
     * @return the square root of the number
     * @throws ArithmeticException if number is negative
     */
    public double squareRoot(double number) {
        if (number < 0) {
            throw new ArithmeticException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(number);
    }

    /**
     * Calculates the percentage of a number.
     *
     * @param number     the number
     * @param percentage the percentage
     * @return the percentage of the number
     */
    public double percentage(double number, double percentage) {
        return (number * percentage) / 100;
    }

    /**
     * Main method to demonstrate calculator functionality.
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Simple Calculator Demo");
        System.out.println("======================");
        
        // Addition
        double sum = calc.add(10, 5);
        System.out.println("10 + 5 = " + sum);
        
        // Subtraction
        double difference = calc.subtract(10, 5);
        System.out.println("10 - 5 = " + difference);
        
        // Multiplication
        double product = calc.multiply(10, 5);
        System.out.println("10 * 5 = " + product);
        
        // Division
        double quotient = calc.divide(10, 5);
        System.out.println("10 / 5 = " + quotient);
        
        System.out.println("\nAll operations completed successfully!");
    }
}

