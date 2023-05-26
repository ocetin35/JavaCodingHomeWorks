package ozlem.week1;

public class Q2 {
    /*
Divide without / operator:
        Write a method that can divide two numbers without using division operator
 */

    public static void division(int dividing, int diveder) {

        int count = 0;

        while (dividing >= diveder) {

            dividing -= diveder;

            count++;


        }

        System.out.println("result : " + count + "\nremainder : " + dividing);

    }

    public static void main(String[] args) {
        division(10,3);
    }


}

