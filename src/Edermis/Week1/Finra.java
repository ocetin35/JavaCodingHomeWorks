package Edermis.Week1;

public class Finra {
    public static void main(String[] args) {
        int num = 10;

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FINRA");
        } else if (num % 3 == 0) {
            System.out.println("FIN");
        } else if (num % 5 == 0) {
            System.out.println("RA");
        } else {
            System.out.println(num);
        }



}

}
