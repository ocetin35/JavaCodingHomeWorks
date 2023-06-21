package ozlem.week4;
/*
 String - Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF") ==> "DEF";
 */
public class Q12 {

      public static String uniqueChar (String str){

          String result = "";

        for (int i = 0; i <= str.length()-1; i++) {

            char each = str.charAt(i);

            if(str.indexOf(each) == str.lastIndexOf(each)){
                result += each;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Q12.uniqueChar("AAABBBCCCDEF"));
    }

    }


