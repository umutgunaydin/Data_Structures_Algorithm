package day06_queues_hashing.reverseFirstKElements;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseFirstKElements {
    public static void main(String[] args) {
        Queue<Integer> intQueue=new LinkedList<>();
        intQueue.addAll(Arrays.asList(1,2,3,4,5));

        System.out.println("Before Reversal");
        System.out.println(intQueue);

        System.out.println("After Reversal");
        System.out.println(reverseFirstKElements(3,intQueue));
    }

    public static Queue<Integer> reverseFirstKElements(int k, Queue<Integer> integerQueue){
        Deque<Integer> kStack=new LinkedList<>();
        for (int i = 0; i < k; i++) {
            kStack.push(integerQueue.remove());
        }
        while (!kStack.isEmpty()){
            integerQueue.add(kStack.pop());
        }
        for (int i = 0; i < integerQueue.size() - k; i++) {
            integerQueue.add(integerQueue.remove());
        }
        return integerQueue;
    }
}
