package ozlem.week5;

import java.util.Arrays;

/*
3) Array - Find Maximum
Write a method that can find the maximum number from an int Array
 */
public class Q16 {

    public static void main(String[] args) {

        int[] array = {1,3,6,6,8,9,5,3,1,0,7,77,77,69,99,99};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(new int[]{array[array.length - 1]}));

      int max  = array[0];

        for (int each :array) {

            if(each > max){
                max =each;
            }

        }

        System.out.println(max);









    }

}
