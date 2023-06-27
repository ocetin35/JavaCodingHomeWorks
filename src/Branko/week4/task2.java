package Branko.week4;

public class task2 {
    //  2) String - Remove Duplicates
    //Write a return method that can remove the duplicated values from String
    //Ex:  removeDup("AAABBBCCC") ==> ABC
    public static void main(String[] args) {

        String input = new String("AAABBBCCC");
        String output = new String();

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < output.length(); j++) {
                if (input.charAt(i) != output.charAt(j)) {
                    output = output + input.charAt(i);
                }
            }
        }

        System.out.println(output);

    }

}



