package Branko.week2;

public class task1 {
        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                if (i % 15 == 0) {
                    System.out.println(i + " is divisible by 15");
                } else if (i % 3 == 0) {
                    System.out.println(i + " is divisible by 3");
                } else if (i % 5 == 0) {
                    System.out.println(i + " is divisible by 5");
                }
            }
        }
    }

/*
write a program that can print numbers between 1 -100 that can be divisible by 3,5,15.
if the number can be divisible by 3,5,and 15 then it should only be dispalyed in divisibel by 15 section ,
if the number can be divisible by 3,,but cannot be divisible by 15,then it should only be dispalyed in divisibel by 3 section,
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be dispalyed in divisibel by 5 section
 */


