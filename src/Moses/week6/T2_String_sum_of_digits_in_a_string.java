package Moses.week6;

public class T2_String_sum_of_digits_in_a_string {

    public static void main(String[] args) {
        String str = "a1b2c3";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
        // For each character the loops checks if it's a digit
            if (Character.isDigit(ch)) {
        // It then converts it to a numeric value and then added to the sum
                int digit = Character.getNumericValue(ch);
                sum += digit;
            }
        }

        System.out.println("Sum of digits as a string = " + sum);
    }
}
