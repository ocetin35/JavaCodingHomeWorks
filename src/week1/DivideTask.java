package week1;
public class DivideTask {


/*

 Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator

 */

    public static int divide(int dividend, int divisor) {
        // Handle division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        // Handle special case: dividend is zero
        if (dividend == 0) {
            return 0;
        }

        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Convert dividend and divisor to positive values
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        // Perform repeated subtraction until dividend is less than divisor
        int quotient = 0;
        while (absDividend >= absDivisor) {
            absDividend -= absDivisor;
            quotient++;
        }

        // Apply the sign to the quotient
        if (isNegative) {
            quotient = -quotient;
        }

        return quotient;
    }

    public static void main(String[] args) {
        int dividend = 15;
        int divisor = 3;

        int quotient = divide(dividend, divisor);
        System.out.println("Quotient: " + quotient);
    }
}