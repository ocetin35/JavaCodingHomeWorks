package emre.week4;

public class SameLetters {

    //   1) String - Same letters
    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex:  same("abc",  "cab"); -> true
    //same("abc",  "abb"); -> false:

    public static boolean same(String str1, String str2) {

        if (str1.length() == 0 || str2.length() == 0)
            return false;

        if (str1.length() != str2.length())
            return false;

        boolean isSame = true;

        for (int j = 0; j < str2.length(); j++) {
            if (!str2.contains(str1.charAt(j) + "") || !str1.contains(str2.charAt(j) + "")) {
                isSame = false;
            }
        }

        return isSame;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        System.out.println(same(str1, str2));  // Output: true
    }
}
