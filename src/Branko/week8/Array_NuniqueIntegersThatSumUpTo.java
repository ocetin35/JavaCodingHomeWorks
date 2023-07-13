package Branko.week8;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Array_NuniqueIntegersThatSumUpTo {
        public static int[] getNUniqueIntegers(int N) {
            int[] result = new int[N];

            // Generate N-1 random numbers
            Random random = new Random();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < N - 1; i++) {
                int num;
                do {
                    num = random.nextInt(N * 2) - N;
                } while (set.contains(num));
                result[i] = num;
                set.add(num);
            }

            // Calculate the last number to make the sum zero
            int sum = 0;
            for (int num : result) {
                sum += num;
            }
            result[N - 1] = -sum;

            return result;
        }

        public static void main(String[] args) {
            int N = 4;
            int[] result = getNUniqueIntegers(N);

            // Print the array
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }


