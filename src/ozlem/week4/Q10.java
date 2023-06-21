package ozlem.week4;

import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
    /*
    Write a return method that check if a string is build out of the same letters
    as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
     */

    public static boolean sameLetter(){

        Scanner input = new Scanner((System.in));
        System.out.println("Enter your first word");
        String word1 = input.nextLine();

        System.out.println("Enter your first word");
        String word2 = input.nextLine();

        char[] arr1 = word1.toCharArray();
        char[] arr2 =word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);




    }

    public static void main(String[] args) {
        System.out.println(Q10.sameLetter());
    }






}
