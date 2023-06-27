package emre.week6;

public class sumOfDigits {

        public static int calculateDigitSum(String input) {

            int sum = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isDigit(c)) {
                    int digit = Character.getNumericValue(c);
                    sum += digit;
                }
            }
            return sum;
        }

        public static void main(String[] args) {
            String input = "Hello123World456";
            int digitSum = calculateDigitSum(input);
            System.out.println("The sum of the digits in the string is: " + digitSum);
        }
    }

