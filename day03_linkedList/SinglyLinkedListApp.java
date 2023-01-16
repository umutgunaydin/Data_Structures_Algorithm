package day03_linkedList;

public class SinglyLinkedListApp {
    public static void main(String[] args) {

        CustomSinglyLinkedList myList=new CustomSinglyLinkedList();
        System.out.println(myList.isEmpty());

        for (int i = 0; i < 10; i++) {
            myList.addLast(i);
        }
        myList.printNodes();

        myList.deleteById(7);//middle
        myList.printNodes();

        myList.deleteById(0);//head
        myList.printNodes();

        myList.deleteById(9);//tail
        myList.printNodes();

        System.out.println("indexOf 8: "+myList.indexOf(8));

        System.out.println("kth item from the last: "+myList.getKthItemFromLast(3));
        myList.removeKthElementFromLast(3);
        myList.printNodes();


    }
}
