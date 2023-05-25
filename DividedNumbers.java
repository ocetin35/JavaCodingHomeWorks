public class DividedNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter dividend number");
        int dividend = scan.nextInt();

        System.out.println("Please enter your divisor number");
        int divisor = scan.nextInt();

        System.out.println(divide(dividend, divisor));

    }
    public static int divide(int dividend, int divisor) {

        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return quotient;
    }
}






}



 /*
 Numbers - Divide without / operator:
  Write a method that can divide two numbers without using division operator

 */
