import java.util.Scanner;

public class Week1 {

// Write  a method which can identify given number is even or odd

    public static void main(String[] args) {

        // Scanner method being used here to receive user info
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first number");

        int number = input.nextInt();

        System.out.println("Please put your second number");

        number = input.nextInt();

        String oddOrEven = (number % 2 == 0 ) ? "Even" : "Odd";






    }

}
