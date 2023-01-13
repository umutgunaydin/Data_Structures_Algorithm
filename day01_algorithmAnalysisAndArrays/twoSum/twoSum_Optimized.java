package day01_algorithmAnalysisAndArrays.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum_Optimized {

    public static void main(String[] args) {
        int[] numbers = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(numbers, 6)));
    }

    public static int[] twoSum(int[] numbers, int target) { // time complexity O(n)

        Map<Integer,Integer> indicesMap=new HashMap<>(); // space complexity O(n)

        for (int i = 0; i < numbers.length; i++) {
            int searching=target-numbers[i];
            if (indicesMap.containsKey(searching)){
                return new int[]{indicesMap.get(searching),i};
            }
            else {
                indicesMap.put(numbers[i],i);
            }
        }
        return null;
    }


}
