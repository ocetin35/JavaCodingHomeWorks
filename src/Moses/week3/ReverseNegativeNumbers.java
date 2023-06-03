package Moses.week3;

public class ReverseNegativeNumbers {
    public static void main(String[] args) {

        int numInput = 12345;
        int numOutput = reverseNegativeNumber(12345);
        System.out.println("numInput : " + numInput + " numOutput : " + numOutput);


    }

    private static int reverseNegativeNumber(int number) {
        boolean isNegative = number < 0? true : false;
        if(isNegative){
            number = number * -1;
        }
        int reverse = 0;
        int lastDigit = 0;

        while(number >= 1){
            lastDigit = number % 10; // gives you the last digit or number
            reverse = reverse * 10 + lastDigit;
            number = number/10; // to get rid of the last digit
        }
        return isNegative == true? reverse*-1: reverse;
    }

}
