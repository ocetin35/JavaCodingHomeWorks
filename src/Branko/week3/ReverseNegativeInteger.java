package Branko.week3;
/*
3) String - Frequency of Characters
Write a return method that can find the frequency of characters
 */
public class ReverseNegativeInteger {
    public static int reverse(int number){
        if(number < 10 && number >= 0){
            return number;
        }

        int result = 0;
        while (number !=0) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        return result;
    }

}
