package ozlem.week2;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class Q6 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {

            String d2 = "Codility";
            String d3 = "Test";
            String d5 = "Coders";

       if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(d2 + d3 + d5);
            } else if (i % 2 == 0 && 3 == 0) {
                System.out.println(d2 + d3);
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(d2 + d5);
            } else if (3 == 0 && i % 5 == 0) {
                System.out.println(d3 + d5);
            } else if (i % 2 == 0) {
                System.out.println(d2);
            } else if (i % 3 == 0) {
                System.out.println(d3);
            } else if (i % 5 == 0) {
                System.out.println(d5);
            }else {
           System.out.println(i);
            }

        }
    }




}




