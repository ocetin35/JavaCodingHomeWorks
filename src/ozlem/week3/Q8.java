package ozlem.week3;

import java.util.Scanner;
/*
     2) Number - Reverse negative number
Write a return method that can reverse negative number and return it as int
    */
public class Q8 {




    public static int ReverseNegative() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        return num - num*2;


    }

    public static void main(String[] args) {
        System.out.println(ReverseNegative());
    }


}
