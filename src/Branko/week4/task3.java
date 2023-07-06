package Branko.week4;

public class task3 {

//   3) String - Find the unique
//Write a return method that can find the unique characters from the String
//Ex:  unique("AAABBBCCCDEF") ==> "DEF";


    public static String unique(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }


}