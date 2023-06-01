package Sohaila.week2;

import java.util.Scanner;

public class Q1DivisibleBy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a number: ");

        int number = input.nextInt();

        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 0; i <= number ; i++) {
            if (i % 15 == 0 && i % 3 ==0){
                divisibleBy15 += i + " ";
            }

            if (i % 5 == 0 && i % 15 !=0){
                divisibleBy5 += i + " ";
            }
            if (i % 3 ==0 && i % 15 != 0){
                divisibleBy3 += i + " ";
            }

        }
        System.out.println("Divisible By 15: " + divisibleBy15);
        System.out.println("Divisible By 5: " + divisibleBy5);
        System.out.println("Divisible By 3: " + divisibleBy3);

        input.close();

    }
}
