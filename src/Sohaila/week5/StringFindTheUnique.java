package Sohaila.week5;

public class StringFindTheUnique {
    /*
      3) String - Find the unique
            Write a return method that can find the unique characters from the String
                Ex: unique("AAABBBCCCDEF")==>"DEF";

     */
    //The method unique(String str) takes a string str as input
    // and returns a string containing the unique characters.
    public static String unique(String str) {

        //The input string str is split into an array of individual characters using the split("") method.
        // Each character is stored in the arr array.
        String[] arr = str.split("");

        //A variable unique1 is initialized as an empty string.
        // This variable will store the unique characters found in the input string.
        String unique1 = "";

        //The outer loop iterates over each character in the arr array.
        for (int j = 0; j < arr.length; j++) {

            //Inside the outer loop, an integer variable num is initialized as 0.
            // This variable will count the number of occurrences of the current character.
            int num = 0;

            //we set the inner loop for iterates over each character in the arr array again.
            for (int i = 0; i < arr.length; i++) {

                //Inside the inner loop, the if condition if (arr[i].equals(arr[j])) compares the current character arr[i]
                //with the character being checked arr[j].
                if (arr[i].equals(arr[j])) {

                    //f the two characters are equal,
                    // num is incremented by 1, indicating that a duplicate occurrence of the character has been found.
                    num++;
                }
            }
            //After the inner loop finishes, the value of num represents the count of occurrences of the character at index j in the arr array.
            //If num is equal to 1, it means that the character occurs only once in the string.
            // In this case, the character is appended to the unique1 string using the += operator.
            if (num == 1) {
                unique1 += arr[j];
            }
        }
        //After the outer loop finishes, the unique1 string contains all the unique characters found in the input string
        //Finally, the unique1 string is returned as the result of the unique method.
        return unique1;
    }

    public static void main(String[] args) {
        //In main method we can now call the unique method with a string to find its unique characters:
        String input = "AAABBBCCCDEF";
        String result = unique(input);
        System.out.println(result);

    }


}
