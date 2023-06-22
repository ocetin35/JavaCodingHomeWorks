package emre.week3;

public class ReverseNegativeNumbers {

    public static void main(String[] args) {
        int number = 987654;
        int reversedNumber = reverseNegative(number);
        int reversedNegativeNumber = -1 * reversedNumber;
        System.out.println("The reverse of the given number is: " + reversedNegativeNumber);
    }

    public static int reverseNegative(int number) {
        boolean isNegative = number < 0;
        if (isNegative) {
            number = Math.abs(number); // Convert negative number to positive for reversal
        }

        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

       return isNegative ? -reverse : reverse; // Restore the sign if the original number was negative
    }
}

//   2) Number - Reverse negative number
//   Write a return method that can reverse negative number and return it as int