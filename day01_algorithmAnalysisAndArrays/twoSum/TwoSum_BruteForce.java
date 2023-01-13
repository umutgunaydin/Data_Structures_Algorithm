package day01_algorithmAnalysisAndArrays.twoSum;

import java.util.Arrays;

public class TwoSum_BruteForce {

    public static void main(String[] args) {
        int[] numbers = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(numbers, 6)));
    }

    public static int[] twoSum(int[] array, int target) { // complexity O(n^2)

        int[] indices = new int[2];

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }
}
