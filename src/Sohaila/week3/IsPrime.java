package Sohaila.week3;

public class IsPrime {
    /*
   [IQ] Prime in range [nested loop, methods, conditional]

	create a method that will accept a number. Print out all the prime numbers in the range between 2 and the given number

	a number is a prime number when it is only divisible by 1 and itself

   Write a method to check if the number is prime or not.
   A number is prime number if it is divisible by 1 or itself
   ex:
    Input:
            100
    Output:
           2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
            */

    public static void main(String[] args) {

        int range = 100;

        for(int j = 2; j <= range; j++){ // num = j

            boolean isPrime = true;

            for(int i = 2; i < j; i++){
                //System.out.println(num + " % " + i + "  " + (num%i));
                if(j % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(j + ", ");
            }
        }

    }

    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static String primeInRange(int range){
        String prime = "";
        for(int i = 2; i <= range; i++){
            if(isPrime(i)){
                prime += i + ", ";
            }
        }
        return prime.substring(0, prime.length()-2);
    }


}
/*

Here's the logic explained step by step:

Line 23) The variable range is initialized with a value of 100, which represents the upper limit of the range within which prime numbers are to be generated.

Line 25) The outer for loop iterates from 2 to the value of range, inclusive.
Each iteration represents a number j that needs to be checked for primality.

Line 27) Inside the outer loop, a boolean variable isPrime is initialized to true.
This variable keeps track of whether the current number j is prime or not.

Line 29) The inner for loop iterates from 2 to j - 1.
Each iteration represents a number i that is a potential divisor of j.
It checks if j is divisible by any number other than 1 and itself.

Line 32) If j is divisible by any number i, the condition j % i == 0 evaluates to true, indicating that j is not prime.
Line 47) In this case, the value of isPrime is set to false, and the inner loop is exited using the break statement.

After the inner loop completes, the value of isPrime is checked.
Line 50) If it is still true, it means that no divisor other than 1 and j itself was found during the inner loop, indicating that j is prime.

37) If isPrime is true, the prime number j is printed to the console.

Line 44) The isPrime method is a helper method that takes an integer n as input and checks if it is prime or not using a similar logic as described above.

Line 53) The primeInRange method generates a string containing all the prime numbers within a given range.
It calls the isPrime method to check each number within the range and appends the prime numbers to the prime string.
Finally, it returns the prime string after removing the last two characters (which are ", ").

In the provided code, the main method simply prints the prime numbers using a comma-separated format.
If you want to obtain the string representation of prime numbers within a given range, you can call the primeInRange method passing the desired range as an argument.
 */

