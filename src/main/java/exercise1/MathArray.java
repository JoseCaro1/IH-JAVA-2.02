package exercise1;

import java.util.ArrayList;
import java.util.Arrays;

public class MathArray {
    /**
     * Employing TDD,
     * create a method that takes in an integer n and returns an array of all
     * odd integers from 1 to n. Write your tests first!
     */


    public static int[] oddNumbersArray(int number) {

        if(number < 0) {
            throw new IllegalArgumentException();
        }
        int[] array;
        int[] result = new int[0];

        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                array = new int[result.length + 1];
                array[result.length] = i;
                for (int j = 0; j < result.length; j++) {
                    array[j] = result[j];
                }
                result = array;
            }

        }
        return result;


    }

    public static int[] oddNumbersArrayMethod(int number) {
        if(number < 0) {
            throw new IllegalArgumentException();
        }
        int[] result = new int[0];

        for (int i = 1; i <= number; i += 2) {
            result = Arrays.copyOf(result, result.length + 1);
            result[result.length - 1] = i;
        }
        return result;
    }


    public static ArrayList<Integer> oddNumbersArrayList(int number) {
        if(number < 0) {
            throw new IllegalArgumentException();
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1;i<=0;i+=2) {
            result.add(i);
        }
        return result;
    }


}
