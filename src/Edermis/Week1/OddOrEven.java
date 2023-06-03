package Edermis.Week1;
  /*
       Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

   */

public class OddOrEven {
    public static void main(String[] args) {

        OddOrEven(5);//odd
        OddOrEven(6);//even
    }
    public static void OddOrEven(int number){

        if (number % 2 == 0 && number %2 !=1) {

            System.out.println("even");

        } else {
            System.out.println("odd");

        }

    }

}



