package Branko.week3;

public class Task3 {
     /*
    3) String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */


        public static String FrequencyOfChars (String word) {

            String result = "";

            for (int i = 0; i < word.length(); i++) {
                if (result.contains("" + word.charAt(i))) {
                    continue;
                }
                int count = 0;

                for (int j = 0; j < word.length(); j++) {

                    if (word.charAt(i) == word.charAt(j)) {
                        count++;
                    }
                }

                result += "" + count + word.charAt(i);


            }

            return result;
        }

        public static void main(String[] args) {
            System.out.println(FrequencyOfChars("AASSSH"));

        }









    }



