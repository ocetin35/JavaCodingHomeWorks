package Edermis.Week2;

import java.util.Scanner;

public class SwapNumbers {

/*Swap two variable values without using a third variable.
For example if num1=5
               num2=6
Return
               num1=6
               num2=5

 */

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println(" Enter your first number:");
            int num1 = input.nextInt();
            System.out.println("Enter your second number:");
            int num2 = input.nextInt();

            num1 = num1+num2;
            num2 = num1-num2;
            num1= num1-num2;

            System.out.println("After Swap: " + num1+","+ num2);
        }

    }


