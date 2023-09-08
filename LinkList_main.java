package Linked_List;

public class main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(2);
        list.insertLast(4);
        list.insertRandom(3,1);
        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);
        list.display();
        //list.deleteFirst();
        //list.display();
        list.deleteLast();
        list.display();

    }
}
