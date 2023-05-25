public class Week1 {

    public static String identify(int number) {

        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first number");
        int number1 = scan.nextInt();

        System.out.println("Please enter your second number");
        int number2 = scan.nextInt();
        scan.close();

        System.out.println(identify(number1)); // Output: Odd
        System.out.println(identify(number2)); // Output: Even


    }
}

//Write  a method which can identify given number is even or odd
//Output ex:
//identify(5); ->"Odd"
//identify(6); ->"Even"