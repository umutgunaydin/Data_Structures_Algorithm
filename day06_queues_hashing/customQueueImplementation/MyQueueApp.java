package day06_queues_hashing.customQueueImplementation;

public class MyQueueApp {
    public static void main(String[] args) {

        System.out.println("By using custom queue");
        MyQueue<Integer> myQueue=new MyQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.printQueue();

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());


    }
}
