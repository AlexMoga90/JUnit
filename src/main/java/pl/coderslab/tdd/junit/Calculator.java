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

    public static double eval(String expression) {
        char[] tokens = expression.toCharArray();

        // Stack for numbers
        double currentNumber = 0;
        char lastOperator = '+';
        double result = 0, lastNumber = 0;

        for (int i = 0; i < tokens.length; i++) {
            char token = tokens[i];

            if (Character.isDigit(token)) {
                currentNumber = currentNumber * 10 + (token - '0');
            }

            if (!Character.isDigit(token) && token != ' ' || i == tokens.length - 1) {
                switch (lastOperator) {
                    case '+':
                        result += lastNumber;
                        lastNumber = currentNumber;
                        break;
                    case '-':
                        result += lastNumber;
                        lastNumber = -currentNumber;
                        break;
                    case '*':
                        lastNumber *= currentNumber;
                        break;
                    case '/':
                        lastNumber /= currentNumber;
                        break;
                }

                lastOperator = token;
                currentNumber = 0;
            }
        }

        result += lastNumber;
        return result;
    }
}
