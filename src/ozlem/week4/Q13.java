package ozlem.week4;
/*
String - Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */
public class Q13 {

    public static String Reverse(String str){

        String reverse = "";


        for (int i = str.length()-1; i >= 0 ; i--) {

            reverse += "" + str.charAt(i);



        }





        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(Q13.Reverse("ozlem"));
    }

}
