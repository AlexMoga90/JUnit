package pl.coderslab.tdd.junit;

public class Calculator {
    // Method for adding two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method for subtracting two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplying two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method for dividing two integers
    // Returns a double to handle division with decimal points
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    // Method for comparing two integers
    public boolean greater(int a, int b) {
        return a > b;
    }

}
