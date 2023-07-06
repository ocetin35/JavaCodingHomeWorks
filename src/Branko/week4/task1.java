package Branko.week4;

public class task1 {
    //1) String - Same letters
    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex:  same("abc",  "cab"); -> true 
    //same("abc",  "abb"); -> false:
    public static boolean same(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] counts = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            counts[c - 'a']++;
        }


        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            counts[c - 'a']--;
        }


        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

}
