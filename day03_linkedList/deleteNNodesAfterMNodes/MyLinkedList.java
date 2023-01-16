package day03_linkedList.deleteNNodesAfterMNodes;

public class MyLinkedList {

    Node head;
    Node tail;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(int data) { // this is adding to the tail
        //create a new node object from data
        Node node = new Node(data);

        if (isEmpty()) {// if the list is empty
            head = tail = node;
        } else {// if there are elements in list
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void addFirst(int data) { // this is adding to the head
        // create new node with data
        Node node = new Node(data);

        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }
    
    void deleteById(int id) {

        //check if empty
        if (isEmpty()) System.out.println("list is empty!");

        //assign prev and current with the head
        Node prev = head;
        Node current = head;

        while (current != null) {
            if (current.id == id) {//there is a match

                // case 1 head
                if (current == head) {
                    head = current.next;
                    current.next = null;
                }
                // case 2 tail
                else if (current == tail) {
                    tail = prev;
                    prev.next = null; // ex-tail will be eligible for garbage collection
                }
                // case 3 middle
                else {
                    prev.next = current.next;
                    current.next = null;// current will be eligible for garbage collection
                }
                // after deletion
                size--;
            }
            // move forward for the other elements of the list
            prev = current;
            current = current.next;
        }
    }

    int indexOf(int id) {
        if (isEmpty()) return -1;
        int pos = 0;
        // iterate through the linked list
        Node current = head;// set my current with the starting element
        while (current != null) {
            if (current.id == id) return pos;
            pos++;
            current = current.next;
        }
        return -1;
    }

    public void printNodes() {
        Node current = head;
        if (head==null){
            System.out.println("null");
        }
        while (current != null) {
            if (current.next == null) System.out.println(current.id + "=> null");
            else {
                System.out.print(current.id + "=> ");
            }
            current = current.next;
        }
    }
}
