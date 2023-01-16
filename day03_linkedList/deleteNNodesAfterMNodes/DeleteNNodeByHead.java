package day03_linkedList.deleteNNodesAfterMNodes;

public class DeleteNNodeByHead {

    public static void deleteNNodesAfterMNodes(Node head, int n, int m) {
        Node current = head;
        Node prev = head;

        while (current != null) {
            if (n==0){
                head.next=null;
                head=null;
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
                if (current == head) {
                    head = current.next;
                    current.next = null;
                    prev.next=null;
                    prev=head;
                    current=head;
                } else {
                    prev.next = current.next;
                    current.next = null;
                    current = prev.next;
                }
            }
        }
    }
}
