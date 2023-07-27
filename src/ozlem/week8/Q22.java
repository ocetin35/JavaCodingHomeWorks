package ozlem.week8;

import java.util.Arrays;

//Array_concat2Arrays
//Write a return method that can concatenate two arrays
public class Q22 {

    public static void main(String[] args) {

        int [] array1 = {1,2,3};
        int[] array2 = {4,5,6,7};

        int[] arrays = Arrays.copyOf(array1, array1.length +array2.length );

        for(int i =0, j = array1.length; i< array2.length; i++, j++){

                arrays[j] = array2[i];

            }

        System.out.println(Arrays.toString(arrays));

        }




    }


