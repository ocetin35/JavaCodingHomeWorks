package Sohaila.week2;

public class Q2SwapNumbers {

    /*
    Swap two variable without using a third variable.
     */
    public static void main(String[] args) {
        int a =10;
        int b = 15;

        a = a + b;
        b = a - b;
        a= a - b;

        System.out.println("a = " + a );
        System.out.println("b = " + b);



    }
}
