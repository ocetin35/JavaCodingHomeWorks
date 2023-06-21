package hasan.week1;

import java.util.Scanner;

/*
Numbers-Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
 */

public class Q1OddOrEven {

    public static String oddOrEven(int number) {

        return (number % 2 == 0) ? "Even" : "Odd"; // Ternary used here and return type is String.
    }

    public static void main(String[] args) { // main method runs first that's why, Scanner class will be complied first to receive user info.

        // Scanner method being used here to receive user info
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first number");

        int num1 = input.nextInt();

        System.out.println("Please enter your second number");

        int num2 = input.nextInt();


        String result1 = oddOrEven(num1);
        String result2 = oddOrEven(num2);

        System.out.println("identify(" + num1 + "); -> " + result1);
        System.out.println("identify(" + num2 + "); -> " + result2);


    }
}

