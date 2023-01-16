package day03_linkedList.deleteNNodesAfterMNodes;

public class Test {
    public static void main(String[] args) {

        System.out.println("Operation With Head Parameter");

        MyLinkedList myLinkedList = new MyLinkedList();

        for (int i = 1; i <= 10; i++) {
            myLinkedList.addLast(i);
        }
        myLinkedList.printNodes();

        DeleteNNodeByHead.deleteNNodesAfterMNodes(myLinkedList.head, 4, 3);
        //System.out.println("head.id = "+myLinkedList.head.id);
        myLinkedList.printNodes();

        /*
        You need to set the list's reference to the head as null, not the passed reference.!!!!!
        DeleteAllElement should accept the list, not the head node, and set the list's head to null.
        Otherwise, the actual list keeps its reference to the existing head.
        From: https://stackoverflow.com/questions/5658465/javadelete-all-the-elements-from-linked-list
         */

        System.out.println("Same Operation With LinkedList Parameter");

        MyLinkedList myLinkedList2=new MyLinkedList();

        for (int i = 1; i <= 10; i++) {
            myLinkedList2.addLast(i);
        }
        myLinkedList2.printNodes();

        DeleteNNodeByList.deleteNNodesAfterMNodes(myLinkedList2,0,3);
        //System.out.println("head.id = "+myLinkedList2.head.id);
        myLinkedList2.printNodes();


    }
}
