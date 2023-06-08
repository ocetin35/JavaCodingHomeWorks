package emre.week3;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String result = getFrequencyOfChars(str);
        System.out.println(result);
    }

    public static String getFrequencyOfChars(String str) {
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // each character from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // to find the frequency of each character
                char each = str.charAt(i); // each character of str
                if (ch == each) {
                    count++;
                }
            }

            if (result.contains("" + ch)) {
                continue;
            }

            result += ch;
            result += count;
        }

        return result;
    }
}