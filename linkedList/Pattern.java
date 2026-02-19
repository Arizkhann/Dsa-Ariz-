package linkedList;

public class Pattern {

    private Node head;
    private int size;



    class Node{

        int data;
        Node next;


        Node(int data){

            this.data=data;
            this.next=null;

            size++;

        }

    }

    public Pattern(){
        size=0;
    }

// 1st method , Add first

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;


    }



    public void printList() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }




    public static void main(String[] args) {
        Pattern obj=new Pattern();
        obj.addFirst(2);
        obj.printList();
        obj.addFirst(3);
        obj.printList();

    }





}
