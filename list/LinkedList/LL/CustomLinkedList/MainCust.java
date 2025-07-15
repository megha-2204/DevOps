package CustomLinkedList;
public class MainCust {
    public static void main(String[] args) {
        // CustomLL list = new CustomLL();
        // list.insertFirst(3);
        // list.insertFirst(5);
        // list.insertFirst(8);
        // list.insertFirst(10);
        // list.insertFirst(32);
        // list.insertLast(99);
        // list.display();
        // list.insertAtIndex(43, 4);
        // System.out.println(list.deleteFirst());
        // list.display();
        // System.out.println(list.deleteLast());
        // list.display();
        
        // System.out.println(list.delete(2));
        // list.display();


        //Doubly Linked list
        // Doubly list = new Doubly();
        // list.insertFirst(3);
        // list.insertFirst(5);
        // list.insertFirst(8);
        // list.insertFirst(10);
        // list.insertFirst(32);
        // list.insertLast(99);
        // list.insert(8,65);
        // list.display();

        //Circular linked list
        CircularLL list = new CircularLL();
        list.insertLast(3);
        list.insertLast(5);
        list.insertLast(8);
        list.insertLast(10);
        list.insertLast(32);
        list.insertLast(99);
        list.insertLast(8);
        list.deleteLL(10);
        list.display();

    }

}
