package day03_linkedList.deleteNNodesAfterMNodes;

public class DeleteNNodeByList {

    public static void deleteNNodesAfterMNodes(MyLinkedList myLinkedList, int n, int m) {
        Node current = myLinkedList.head;
        Node prev = myLinkedList.head;

        while (current != null) {
            if (n==0){
                myLinkedList.head.next=null;
                myLinkedList.head=null;
                return;
            }
            for (int i = 0; i < n; i++) {
                if (current == null) {
                    return;
                }
                prev = current;
                current = current.next;
            }
            for (int i = 0; i < m; i++) {
                if (current == null) {
                    return;
                }
                if (current == myLinkedList.head) {
                    myLinkedList.head = current.next;
                    current.next = null;
                    prev.next=null;
                    prev=myLinkedList.head;
                    current=myLinkedList.head;
                } else {
                    prev.next = current.next;
                    current.next = null;
                    current = prev.next;
                }
            }
        }
    }
}
