package Sohaila.week4;

public class SameLetters {
    /*
    1) String - Same letters
        Write a return method that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true
                same("abc", "abb"); -> false:

     */

    //Define a method with a return type of boolean that takes two strings as input.
    // named the method sameLetters.
    public static boolean sameLetters(String str1, String str2) {

        //Check if the lengths of the two strings are different.
        // If they are different, it means they cannot be built out of the same letters, so return false.
        if (str1.length() != str2.length()) {
            return false;
        }
        //Convert both strings to lowercase to ensure case-insensitive comparison.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //Create a character array for each string to store the occurrence count of each letter.
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        //Iterate through each character in the first string
        // and update the corresponding count in count1.
        for (char c : str1.toCharArray()) {
            count1[c - 'a']++;
        }

        //Iterate through each character in the second string
        // and update the corresponding count in count2.
        for (char c : str2.toCharArray()) {
            count2[c - 'a']++;
        }

        //Compare the count arrays count1 and count2 to check if they are equal.
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        //If the loops complete without returning false
        // it means both strings are built out of the same letters, so return true.
        return true;
    }

    public static void main(String[] args) {
        //Now using main method we can now call the above  method
        // and pass the two strings as input to check if they are built out of the same letters.
        String str1 = "abc";
        String str2 = "cab";
        boolean result = sameLetters(str1, str2);
        System.out.println(result);  //  true

        str1 = "abc";
        str2 = "abb";
        result = sameLetters(str1, str2);
        System.out.println(result);  // false

    }



}
