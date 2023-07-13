package ozlem.week4;

public class Q11 {
    /*
     String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static String removeDuplicate(String str){

        String result = "";

        for(int i = 0; i< str.length(); i++ ){

          if(!result.contains( "" + str.charAt(i))){

              result += str.charAt(i);

          }

        }

        return result;


    }

    public static void main(String[] args) {
        System.out.println(Q11.removeDuplicate("aaabbbbyyyycc"));

    }


}
