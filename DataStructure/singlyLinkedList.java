package DataStructure;
import DataStructure.singlyLinkedList.Node;



public class singlyLinkedList {
    
    public static void main(String[] args){

        singlyLinkedList list=new singlyLinkedList();  //head=null

        Node newNode=new Node(10);  // [100]  | 10 | |null |
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);

        list.display();

        Node head=list.getHead();
        Head=newNode;
        list.addLast(50);
        list.addLast(60);
        list.addList(70);

        list.display();

    }
}
