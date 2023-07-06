package Branko.week7;

public class SortDescending {
    public static int[] sortArrayDescending(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr; // Return the array if it's null or has only one element
        }

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1] for descending order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break; // If no two elements were swapped, the array is already sorted
            }
        }

        return arr;
    }

}
