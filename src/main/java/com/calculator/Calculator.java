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
     * Calculates the average of a set of numbers.
     *
     * @param numbers the numbers to average
     * @return the average of the numbers
     * @throws IllegalArgumentException if no numbers are provided
     */
    public double average(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required to calculate average");
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    /**
     * Calculates the factorial of a non-negative integer.
     *
     * @param n the non-negative integer
     * @return the factorial of n
     * @throws IllegalArgumentException if n is negative or too large
     */
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n > 20) {
            throw new IllegalArgumentException("Factorial of numbers greater than 20 exceeds long capacity");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Calculates the modulus (remainder) of dividing a by b.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the remainder of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot perform modulus with zero divisor");
        }
        return a % b;
    }

    /**
     * Returns the absolute value of a number.
     *
     * @param number the number
     * @return the absolute value of the number
     */
    public double absolute(double number) {
        return Math.abs(number);
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
        
        // Power
        double power = calc.power(2, 3);
        System.out.println("2 ^ 3 = " + power);
        
        // Average
        double avg = calc.average(10, 20, 30, 40, 50);
        System.out.println("Average of (10, 20, 30, 40, 50) = " + avg);
        
        // Factorial
        long fact = calc.factorial(5);
        System.out.println("5! = " + fact);
        
        // Modulus
        double remainder = calc.modulus(17, 5);
        System.out.println("17 % 5 = " + remainder);
        
        // Absolute
        double absValue = calc.absolute(-42.5);
        System.out.println("|-42.5| = " + absValue);
        
        System.out.println("\nAll operations completed successfully!");
    }
}

