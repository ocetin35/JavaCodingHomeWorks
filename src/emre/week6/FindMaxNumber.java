package emre.week6;

public class FindMaxNumber {
    public static int findMaximum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int max = array[0]; // Assume the first element is the maximum

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update the maximum if a larger element is found
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 2, 18, 3};
        int maximum = findMaximum(numbers);
        System.out.println("Maximum number: " + maximum);
    }

}
