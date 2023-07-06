package Branko.week7;

public class one {
    // 1) Array - Find Minimum
    // Write a method that can find the maximum number from an int Array
    public static int findMaximum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array is empty or null.");
        }

        int max = arr[0]; // Initialize max as the first element of the array

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }

        return max;
    }
}


