package day04_stacks_recursion.customStackImplementation;

import java.util.NoSuchElementException;

public class MyStack<T> {

    public StackNode<T> bottom;
    public StackNode<T> top;
    int size;

    public boolean isEmpty() {
        return bottom == null;
    }

    public void push(T item) {
        StackNode<T> node = new StackNode<>(item);
        if (isEmpty()) {
            bottom = top = node;
        } else {
            top.next = node;
            top = node;
        }
        size++;
    }

    public T peek() {
        return (T) top.value;
    }

    public T pop() {
        StackNode peekNode;
        if (isEmpty()) throw new NoSuchElementException();
            // if stack has only one element
        else if (top == bottom) {
            peekNode = top;
            top = bottom = null;
        } else { //more than one element
            peekNode = top;
            StackNode prev = bottom;
            while (prev.next != top) {
                prev = prev.next;
            }
            prev.next = null;
            top = prev;
        }
        size--;
        return (T) peekNode.value;
    }
}
