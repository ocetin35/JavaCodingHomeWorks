package ozlem.week3;

/*
  1) Numbers - Prime Number
    Write a method that can check if a number is prime or not
 */
public class Q7 {



        public static String primeNumber(int num) {

               for(int i =2; i < num; i++){

                   if(num % i == 0){

                       return num + " is not a Prime number";
                   }

         }

               return num + " is a Prime number";
        }


        public static void main(String[] args) {

                System.out.println(primeNumber(1));


        }
}