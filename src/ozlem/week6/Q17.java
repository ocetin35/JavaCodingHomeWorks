package ozlem.week6;

import javax.imageio.stream.ImageInputStream;

/*
 Array - Find Minimum
Write a method that can find the min. number from an int Array
 */
public class Q17 {

    public static void main(String[] args) {


            int[] array = {1, 3, 6, 6, 8, 9, 5, 3, 1, -57,-57,-56,-58, 7, 77, 77, 69, 99, 99};

            int min = array[0];

            for (int each : array) {

                if (each < min) {
                    min = each;
                }

            }
        System.out.println(min);

        }

    }


