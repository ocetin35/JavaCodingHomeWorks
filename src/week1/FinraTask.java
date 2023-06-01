package week1;

public class FinraTask {

        public static void main(String[] args) {
            for (int i = 1; i <= 30; i++) {
                String message = "";

                if (i % 3 == 0 && i % 5 == 0) {

                    message = "FINRA";
                } else if (i % 5 == 0) {

                    message = "RA";
                } else if (i % 3 == 0) {
                    message = "FIN";

                } else {
                    System.out.print(i + " ");
                }
                System.out.print(message + " ");
            }
        }
    }


/*
Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number. (edited)

 */



