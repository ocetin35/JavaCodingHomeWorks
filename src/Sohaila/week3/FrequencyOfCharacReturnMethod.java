package Sohaila.week3;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacReturnMethod {
    /*
    [method, HashMap, ForEachLoop, condition, StringBuilder]
     3) String - Frequency of Characters
        Write a return method that can find the frequency of characters
        Ex:FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    */

    //Define a method with a return type that takes a string as input. named frequencyOfChars.
    public static String frequencyOfChars(String input){

        // Creating a HashMap to store the characters as keys and their frequencies as values.
        //The key-value pairs in a HashMap provide an efficient way to store and retrieve data.
        Map<Character,Integer> charFrequencies = new HashMap<>();

        //Iterating through each character in the input string.
        for (char c: input.toCharArray()) {
            //Check if the character is already present in the charFrequencies map.
            if (charFrequencies.containsKey(c)) {
                //If it is, increment its frequency by 1.
                charFrequencies.put(c, charFrequencies.get(c) + 1);
                //Otherwise, add it to the map with a frequency of 1.
            } else {
                charFrequencies.put(c, 1);
            }
        }
        //Creating a StringBuilder to build the final result string.
        StringBuilder result = new StringBuilder();
        //Iterate through the charFrequencies map and append each character along with its frequency to the result string.
        for (Map.Entry<Character,Integer> entry : charFrequencies.entrySet()){
            result.append(entry.getKey());
            result.append(entry.getValue());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // //Finally, return the result string.
        String input = "AAABBCDD";
        String frequency = frequencyOfChars(input);

        System.out.println(frequency);
    }


}
/*
Line 7) Define a method with a return type that takes a string as input. Let's name the method frequencyOfChars.

Line 8) Creating a HashMap to store the characters as keys and their frequencies as values.
The key-value pairs in a HashMap provide an efficient way to store and retrieve data.

Line 10) Iterating through each character in the input string.

Line 11-14)Check if the character is already present in the charFrequencies map.
If it is, increment its frequency by 1.
Otherwise, add it to the map with a frequency of 1.

Line 18) Creating a StringBuilder to build the final result string.

Line 19-21)Iterate through the charFrequencies map and append each character along with its frequency to the result string.

Line 22) Finally, return the result string.


 */


