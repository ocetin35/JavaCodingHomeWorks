package Moses.week1;

import java.util.Scanner;

public class Task1 {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in); // use the scanner method
            System.out.println("Enter first number");
            int a = input.nextInt();
            System.out.println("Enter second number");
            int b = input.nextInt();

            int count = 0; //
            while(a >= b){
                a = a - b;
                count = count + 1;
            }
            System.out.println("Divide is = " + count);



        }
    }

