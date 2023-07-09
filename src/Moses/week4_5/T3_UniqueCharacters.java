package Moses.week4_5;

public class T3_UniqueCharacters {
    public static void main(String[] args) {


        String str = "AAABBBCCCDEF";

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(str.indexOf(each) == str.lastIndexOf(each)){
                unique += each;
            }

        }
        System.out.println(unique);

    }
}
