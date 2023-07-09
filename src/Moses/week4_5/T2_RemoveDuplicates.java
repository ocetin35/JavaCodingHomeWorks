package Moses.week4_5;

public class T2_RemoveDuplicates {
    public static void main(String[] args) {


        String str = "aabbbcccc";
        String result = "";   // To store new variable "abc"

        for (int i = 0; i < str.length(); i++) { // i: represents the index number of str
            System.out.println(str.charAt(i)); // this prints all the characters of the string

            char each = str.charAt(i); // each character of the string str

            if (!result.contains("" + each)) { // if the string result does not contain the character of string str yet
                result += each; // then we will the character to the string result
            }

        }
        System.out.println(result);


    }
}
