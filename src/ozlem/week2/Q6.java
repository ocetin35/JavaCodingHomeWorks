package ozlem.week2;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

/* Given a positive integer N, print consecutive numbers from 1 to N. and each on the seperate line.
Print the numbers until N number depends on the divisible by 2 - 3 and 5. If the number is divisible by 2
replace that number with  Codility, if the number divisible by 3 replace Test and if the number divisible
by 5 replace with Coders string.
If the number divisible more than one of the numbers, merge both or three of the result.

For example if you enter Number 8 the result should be ;

1
Codility
Test
Codility
Coders
CodilityTest //as 6 is divisible by 2 and 3 there is 2 result of the string
7
Codility

 */

public class Q6 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = input.nextInt();
        if (N < 0) {
            System.out.println("Number supposed to be positive number");
        }

        for (int i = 1; i <= N; i++) {

                String d2 = "Codility";
                String d3 = "Test";
                String d5 = "Coders";

                if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                    System.out.println(d2 + d3 + d5);
                } else if (i % 2 == 0 && i % 3 == 0) {
                    System.out.println(d2 + d3);
                } else if (i % 2 == 0 && i % 5 == 0) {
                    System.out.println(d2 + d5);
                } else if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(d3 + d5);
                } else if (i % 2 == 0) {
                    System.out.println(d2);
                } else if (i % 3 == 0) {
                    System.out.println(d3);
                } else if (i % 5 == 0) {
                    System.out.println(d5);
                } else {
                    System.out.println(i);
                }

            }


        }

    }




