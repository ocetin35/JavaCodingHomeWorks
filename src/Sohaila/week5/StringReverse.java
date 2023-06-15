package Sohaila.week5;

public class StringReverse {

    /*
     4) String - Reverse
        Write a return method that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */
    //Define a method with a return type of String that takes a string as input. name StrReverse method.
    public static String StrReverse(String str) {
        //Create an empty string variable reverse to store the reversed string.
        String reverse = "";

        //Use a for loop to iterate through the characters of the input string in reverse order.
        for (int i = str.length() - 1; i >= 0; i--) {

            //Inside the loop, append each character to the reverse string using the += operator.
            reverse += str.toCharArray()[i];
        }

        //After the loop completes, the reverse string will contain the reversed characters of the input string
        //Finally, return the reverse string as the result of the StrReverse method.
        return reverse;
    }

    public static void main(String[] args) {

        // we can call the StrReverse method and pass the input string to revers it
        String input = "ABCD";
        String result = StrReverse(input);
        System.out.println(result);
    }
}
