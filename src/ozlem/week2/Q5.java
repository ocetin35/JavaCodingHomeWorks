package ozlem.week2;

public class Q5 {
    public static void main(String[] args) {
        /*
     numbers from 1 to 100 divisible by 15 - 3 and 5 ?
 */


            String divisibleby15 = "";
            String divisibleby5 = "";
            String divisibleby3 = "";


            for (int i = 1; i <= 100; i++) {

                if (i % 15 == 0) {
                    divisibleby15 += i + " ";
                } else if (i % 5 == 0) {
                    divisibleby5 += i + " ";
                } else if (i % 3 == 0) {
                    divisibleby3 += i + " ";
                }



            }


    }
}
