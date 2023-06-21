package Sohaila.week3;

public class ReverseNegativeNum {
    /*
    Number - Reverse negative number
    Write a return method that can reverse negative number and return it as int
    example:
        negativeNumber = -123456
            output: -654321
     */
    //Define a method with a return type of int that takes an int number as input.named reverseNegativeNumber.
    public static int reverseNegativeNumber(int number){
        //Check if the input number is negative.
        if (number >= 0){
            //If it is not negative, simply return the number as it is since it does not need to be reversed.
            return number;
        }
        //Convert the negative number to a positive number by multiplying it by -1.
        number *= -1;

        //Convert the positive number back to a string to enable the reversal of its digits.
        String numberString = String.valueOf(number);

        //Reverse the string using a StringBuilder.
        StringBuilder reversedString = new StringBuilder(numberString).reverse();

        //Convert the reversed string back to an int by using the Integer.parseInt() method.
        int reverseNumber = Integer.parseInt(reversedString.toString());

        //Multiply the reversed number by -1 to revert it to its negative form.
        reverseNumber *= -1;

        //Finally, return the reversed negative number.
        return reverseNumber;

    }

    public static void main(String[] args) {
        //then using main method we  can now call the above method and pass the negative number as input to get the reversed negative number.
        int negativeNumber = -123456;
        int reverseNegativeNumber = reverseNegativeNumber(negativeNumber);
        System.out.println("reverseNegativeNumber = " + reverseNegativeNumber);
    }

}
