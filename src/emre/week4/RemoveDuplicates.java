package emre.week4;

//2) String - Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex:  removeDup("AAABBBCCC") ==> AB

public class RemoveDuplicates {

    public static String removeDup(String str) {

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains(str.charAt(i) + ""))
                unique += str.charAt(i);
        }

        return unique;
    }

    public static void main(String[] args) {

        System.out.println(removeDup("aabbssbssaa"));


    }

}
