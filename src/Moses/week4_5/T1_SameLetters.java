package Moses.week4_5;

import java.util.Arrays;

public class T1_SameLetters {

    public static boolean same(String str1, String str2) {
        // Convert the strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Convert the sorted character arrays back to strings
        String sortedStr1 = new String(charArray1);
        String sortedStr2 = new String(charArray2);

        // Compare the sorted strings
        return sortedStr1.equals(sortedStr2);
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        System.out.println(same(str1, str2));  // Output: true

        str1 = "abc";
        str2 = "abb";
        System.out.println(same(str1, str2));  // Output: false
    }
}

