package day06_queues_hashing.customQueueImplementation;

public class QNode<T> {

    T value;
    QNode<T> next;

    public QNode(T value) {
        this.value = value;
    }

}
