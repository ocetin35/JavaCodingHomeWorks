package Edermis.Week1;
  /*
       Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

   */

public class OddOrEven {
    public static void main(String[] args) {

        oddOrEven(5);//odd
        oddOrEven(6);//even
    }
    public static void oddOrEven(int number){

        if (number % 2 == 0 && number %2 !=1) {

            System.out.println("even");

        } else {
            System.out.println("odd");

        }

    }

}



