package day03_linkedList;

public class CustomSinglyLinkedList {

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

    public int getKthItemFromLast(int k) {
        //create two pointers
        Node ptr1 = head;
        Node ptr2 = head;
        // move ptr2 k-1 times
        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
        }
        //move both pointers until ptr2 hits the last element
        while (ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        // ptr 1 is on the Kth element from the last
        return ptr1.id;
    }

    public void removeKthElementFromLast(int k) {
        //create three pointers
        Node ptr1 = head;
        Node ptr2 = head;
        Node prev = null;
        // move ptr2 k-1 times
        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
        }
        //move both pointers until ptr2 hits the last element
        while (ptr2.next != null) {
            prev = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        // ptr 1 is on the Kth element from the last

        // do delete operation
        if (ptr1 == head) {
            head = ptr1.next;
            ptr1.next = null;
        } else if (ptr1 == tail) {
            prev.next = null;
            tail = prev;
        } else {
            prev.next = ptr1.next;
            ptr1.next = null;
        }
        size--;
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
        while (current != null) {
            if (current.next == null) System.out.println(current.id + "=> null");
            else {
                System.out.print(current.id + "=> ");
            }
            current = current.next;
        }
    }


}
