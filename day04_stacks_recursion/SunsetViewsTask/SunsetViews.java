package day04_stacks_recursion.SunsetViewsTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class SunsetViews {

    public static void main(String[] args) {
        System.out.println(sunsetViews(new int[]{3, 5, 4, 4, 3, 1, 3, 2},"east"));
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings,String direction){

        Deque<Integer> indexStack=new LinkedList<>();
        ArrayList<Integer> indices=new ArrayList<>();

        if (direction.equalsIgnoreCase("west")){
            for (int i = 0; i < buildings.length; i++) {
                int eachHeight=buildings[i];
                if (indexStack.isEmpty()) {
                    indexStack.push(i);
                } else if (buildings[indexStack.peek()] < eachHeight) {
                    indexStack.push(i);
                }
            }
            indices.addAll(indexStack);
            Collections.reverse(indices);
        } else if (direction.equalsIgnoreCase("east")) {
            for (int i = buildings.length-1; i >=0 ; i--) {
                int eachHeight=buildings[i];
                if (indexStack.isEmpty()) {
                    indexStack.push(i);
                } else if (buildings[indexStack.peek()] < eachHeight) {
                    indexStack.push(i);
                }
            }
            indices.addAll(indexStack);
        }

        return indices;
    }
}
