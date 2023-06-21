package Branko.week2;

public class task2 {

        public static void printNumbers(int n) {
            for (int i = 1; i <= n; i++) {
                String output = "";

                if (i % 2 == 0) {
                    output += "Codility";
                }
                if (i % 3 == 0) {
                    output += "Test";
                }
                if (i % 5 == 0) {
                    output += "Coders";
                }

                if (output.isEmpty()) {
                    System.out.println(i);
                } else {
                    System.out.println(output);

                }
            }
        }

                    public static void main(String[] args) {
                        printNumbers(100);
                    }
                }



/*
write a function that given a positive integer n, prints the consecutive numbers from 1 to n , each on a separate line.howewer any number divisible by 2,3,or 5 should be replaced by the word Codilithy,test or coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5 ,it should be replaced by a concatenation of the respective words Codility. Test and coders in this gic=ven order. For example , numbers divisible by both 2 and 3 should be replaced by Codility test and numbers divisible by all three numbers:2,3, and 5 ,should be replaced by Codilitytest coders
 */