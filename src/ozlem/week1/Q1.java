package ozlem.week1;

public class Q1 {
    /*
 Write  a method which can identify given number is even or odd
        Output ex:
        identify(5); ->"Odd"
        identify(6); ->"Even"
  */

    public static String oddOrEven(int num) {

        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }

    }
}
