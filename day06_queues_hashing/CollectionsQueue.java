package day06_queues_hashing;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionsQueue {
    public static void main(String[] args) {
        System.out.println("By using built-in queue");
        Queue<Integer> cq=new LinkedList<>();
        cq.add(1);
        cq.add(2);
        System.out.println(cq.remove());
        System.out.println(cq.remove());
    }
}
