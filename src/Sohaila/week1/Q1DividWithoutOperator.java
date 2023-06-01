package Sohaila.week1;

public class Q1DividWithoutOperator {
        public static void main(String[] args) {
            int a = 60;
            int b = 8;

            int count = 0;
            while (a >= b) {
                a -= b;
                count++;

            }
            System.out.println(count + " with a reminder of " + a);

            System.out.println("_________________________________________________________________");

            int dividend = 60;
            int divisor = 5;
            int quotient = 0;

            while (dividend >= divisor) {
                dividend -= divisor;
                quotient++;
            }
            System.out.println("Quotient = " + quotient);

        }
}
