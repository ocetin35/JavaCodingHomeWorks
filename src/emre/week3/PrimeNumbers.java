package emre.week3;

import java.util.Scanner;
public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your number...");
        int number = scan.nextInt();

        if(isPrime(number)) {
            System.out.println(number  + " is a prime number");
        }else{
            System.out.println(number + " is not a prime number");
        }
    }
    public static boolean isPrime(int number){


        if (number <= 1){
        return false;
        }

        for(int i = 2; i <= number / 2; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}


//    1) Numbers - Prime Number
//    Write a method that can check if a number is prime or not