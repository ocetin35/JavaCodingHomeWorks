package Moses.week7;

import java.util.Arrays;

public class T2_Sort_Ascending_Array {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        arr = sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int[] sort(int[] arr) {
        int n = arr.length;
        // The outer loop controls the number of passes
        for (int i = 0; i < n - 1; i++) {
        // The inner loop performs the actual comparisons and swaps them
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;


    }

}

