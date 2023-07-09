package Moses.week7;

public class T1_Array_Find_Minimum {

    public static void main(String[] args) {

        int[] number = {100,20,500,40,-10,30};

        int min = number[0]; // we assume that the 1st element is the minimum number

        for (int i = 1; i < number.length; i++) {

            if(number[i] < min){ // compares the element numbers of the array with the correct minimum number
                min = number[i]; // replaced the current minimum number
            }
        }
        System.out.println("min = " + min);

    }
}
