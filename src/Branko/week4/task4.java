package Branko.week4;

public class task4 {
    //    4) String - Reverse
    //Write a return method that can reverse String
    //Ex: Reverse("ABCD"); ==> DCBA

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();
    }

}
