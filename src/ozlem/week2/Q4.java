package ozlem.week2;

public class Q4 {
    /*
   Numbers -- Swap Numbers
Swap two variable' values without using a third variable

 */

    public static void SwapNumbers(int a, int b){

        a = a -b;
        b = a +b;
        a = b-a;

        System.out.println("a : " + a + "\nb : " + b);


    }
}
