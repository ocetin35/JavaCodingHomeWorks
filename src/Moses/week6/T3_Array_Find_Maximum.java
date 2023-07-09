package Moses.week6;

public class T3_Array_Find_Maximum {

    public static void main(String[] args) {

        int[] number = {100,20,500,40,-10,30};

        int max = number[0]; // we assume that the 1st element is the maximum number

        for (int i = 1; i < number.length; i++) {
            if(number[i] > max){ // compares the element numbers of the array with the correct maximum number
                max = number[i]; // replaced the current maximum number
            }
        }
        System.out.println("max = " + max);

    }
}
