package Moses.week4_5;

public class T4_ReverseAString {

    public static void main(String[] args) {


        String str = "ABCD";
        //            0123   DCBA

        String reverse = ""; //"DCBA" To contain all the characters of the given string

        for (int i = str.length() - 1; i >= 0; i--) { // to get the index numbers of the string
            reverse += str.charAt(i); // same as reverse = reverse + str.charAt(i)

        }
        System.out.println(reverse);
    }
}
