package Moses.week3;

public class PrimeNumbers {
    /*
In java write a method that can check if a number is prime or not
Prime is a number that can be divided by the number itself or 1
 */
    public static void main(String[] args) {

        int num =12;
        int count = 0;

        for (int i = 1; i <= num ; i++) {
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }



    }

}
