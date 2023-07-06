package ozlem.week5;

import java.util.Arrays;

/*
2) String - sum of digits in a string
Write a method that can return the sum of the digits in a string
 */

/*
As chars in ascii table starts with 48 and 48 is equal 0. we supposed to make -48 to get the real digit from ascii tabla.

//In the ASCII character encoding scheme, each character has a corresponding numeric value.
// The character '0' has an ASCII value of 48, '1' has a value of 49, '2' has a value of 50,
// and so on.
 */



public class Q14 {

    public static void main(String[] args) {

        String str = "1234JAVA5";

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);


            if(ch >= '0' && ch <= '9'){

                sum += ch-48;
            }





        }

        System.out.println(sum);






    }

}