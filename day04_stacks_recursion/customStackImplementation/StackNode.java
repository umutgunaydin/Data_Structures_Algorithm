package day04_stacks_recursion.customStackImplementation;

public class StackNode <T>{

    public T value;
    StackNode next;

    public StackNode(T value) {
        this.value = value;
    }
}
