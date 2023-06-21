package Sohaila.week4;

import java.util.HashMap;
import java.util.Map;

public class StringRemoveDuplicate {
    /*
    2) String - Remove Duplicates
        Write a return method that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> AB

     */
    //Define a method with a return type of String that takes a string as input.
    // named the method removeDuplicates.
    public static String removeDuplicates(String input) {

        //Create a HashMap to store the characters as keys and their occurrence count as values.
        // The key-value pairs in a HashMap provide an efficient way to store and retrieve data.
        Map<Character, Integer> charOccurrences = new HashMap<>();

        //Iterate through each character in the input string.
        for (char c : input.toCharArray()) {

            //Check if the character is already present in the charOccurrences map.
            if (charOccurrences.containsKey(c)) {
                //If it is, increment its occurrence count by 1.
                charOccurrences.put(c, charOccurrences.get(c) + 1);
            } else {
                //Otherwise, add it to the map with an occurrence count of 1.
                charOccurrences.put(c, 1);
            }
        }

        //Create a StringBuilder to build the final result string.
        StringBuilder result = new StringBuilder();

        //iterate through the input string again
        // and append each character to the result string only if its occurrence count is 1.
        for (char c : input.toCharArray()) {
            if (charOccurrences.get(c) == 1) {
                result.append(c);
            }
        }

        //Finally, return the result string.
        return result.toString();
    }
    /*
    //Defining the method named removeDup that return type is String.
    public static String removeDup(String input) {

    //Creating LinkedHashSet to store the unique characters of the input string
    //while preserving their order
    LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

    //converting the input string a character array
    char[] chars = input.toCharArray();

    //Iterate through each character in the chars array.
    for (char c : chars) {

    //Add each character to the uniqueChars set.
    //Since LinkedHashSet does not allow duplicate values, only the unique characters will be stored.
        uniqueChars.add(c);
    }

    //Create a StringBuilder to build the final result string.
    StringBuilder result = new StringBuilder();

    //Iterate through the uniqueChars set and append each character to the result string.
    for (char c : uniqueChars) {
        result.append(c);
    }
    //Finally, return the result string.
    return result.toString();
}
//We  can now call this method and pass the input string to remove the duplicated values.
    String input = "AAABBBCCC";
    String result = removeDup(input);
    System.out.println(result);
     */

    public static void main(String[] args) {
        // using main method now we can call the removeDuplicate method
        // and pass the input string to get the string with duplicates removed.
        String input = "AAABBBCCC";
        String result = removeDuplicates(input);
        System.out.println(result);
    }


}
