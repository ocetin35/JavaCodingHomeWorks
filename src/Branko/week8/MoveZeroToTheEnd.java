package Branko.week8;

public class  MoveZeroToTheEnd{

        public static void moveZerosToTheEnd(int[] arr) {
            int n = arr.length;
            int count = 0; // Count of non-zero elements

            // Traverse the array. If the current element is non-zero,
            // then swap it with the previous non-zero element at index 'count'
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    int temp = arr[count];
                    arr[count] = arr[i];
                    arr[i] = temp;
                    count++;
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
            moveZerosToTheEnd(arr);

            // Print the modified array
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
