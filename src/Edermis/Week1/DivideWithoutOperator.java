package Edermis.Week1;

public class DivideWithoutOperator {
    public static void divide(int dividend, int divisor) {
        if (divisor == 0) {
            System.out.println("Invalid Number");
            return;
        }

        int count = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        divide(20, 3);
    }
}

//Write a method that can divide two numbers without using division operator

