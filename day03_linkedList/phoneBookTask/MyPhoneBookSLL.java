package day03_linkedList.phoneBookTask;

import java.util.ArrayList;

public class MyPhoneBookSLL {

    PhoneNode head;
    PhoneNode tail;

    int size;

    boolean isEmpty() {
        return head == null;
    }

    void insert(PhoneNode node) {
        if (isEmpty()) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    PhoneNode findByName(String name) { // will return the first matching record
        PhoneNode current = head;
        while (current != null) {
            if (current.getName().equals(name)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    ArrayList<PhoneNode> findAllByLastName(String lastName) {// will return all the matching records
        ArrayList<PhoneNode> list = new ArrayList<>();
        PhoneNode current = head;
        while (current != null) {
            if (current.getLastName().equals(lastName)) {
                list.add(current);
            }
            current = current.next;

        }
        return list;
    }

    void deleteByName(String name) {// will delete the first matching record only
        PhoneNode prev = head;
        PhoneNode current = head;
        while (current != null) {
            if (current.getName().equals(name)) {
                if (current == head) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                current.next = null;
                size--;
                return;
            } else {
                prev = current;
                current = current.next;
            }
        }
    }

    void deleteAllMatchingLastName(String lastName) {// will delete all the matching records
        PhoneNode prev = head;
        PhoneNode current = head;
        while (current != null) {
            if (current.getLastName().equals(lastName)) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                    prev = head;
                    current = head;
                } else {
                    prev.next = current.next;
                    current.next = null;
                    current = prev.next;
                }
                size--;
            } else {
                prev = current;
                current = current.next;
            }
        }
    }

    ArrayList<PhoneNode> findAll() {
        PhoneNode current = head;
        ArrayList<PhoneNode> list = new ArrayList<>();
        while (current != null) {
            list.add(current);
            current = current.next;
        }
        return list;
    }

    void printPhoneBook() {
        PhoneNode current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.print(current + " => null");
            } else {
                System.out.print(current + " => ");
            }
            current = current.next;
        }
    }
}
