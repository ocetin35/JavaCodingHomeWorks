package Edermis.Week2;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        int n = 24;
        String str1 = "Codility";
        String str2 = "Test";
        String str3 = "Coders";

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(str1 + str2 + str3);
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(str1 + str2);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(str2 + str3);
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(str1 + str3);
            } else if (i % 2 == 0) {
                System.out.println(str1);
            } else if (i % 3 == 0) {
                System.out.println(str2);
            } else if (i % 5 == 0) {
                System.out.println(str3);
            } else {
                System.out.println(i);
            }


        }
    }}

