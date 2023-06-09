import java.util.*;

class main{
Node head; //create head of LL
    private int size;

    main() {
        this.size = 0;
    }

    //Creating Node
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }



// Add node at first
    public void firstAdd(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }



// Add node at last
    public void lastAdd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
            currNode.next = newNode;
    }



    // print  list
    public void printList(){
    if(head == null){
        System.out.println("list is empty");
    }
    Node currNode = head;
    while(currNode != null){
    System.out.print(currNode.data + " -> ");
        currNode = currNode.next;
    }
        System.out.println("NULL");
    }




    // Delete first
    public void firstDelete(String data){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }




    //Delete last
    public void lastDelete(String data){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next == null){  // corner case
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

     /*
       Node last = head;
        while(last.next != null){
          last = last.next;
        }
        last = null;
        */
    }



    public int getSize(){
        return size;
    }



    //reverse LL
public void reverseIterate() {
    if (head == null || head.next == null) {
        return;
    }

    Node prevNode = head;
    Node currNode = head.next;
    while (currNode != null) {
        Node nextNode = currNode.next;
        currNode.next = prevNode;

        //Update
        prevNode = currNode;
        currNode = nextNode;
    }

    head.next = null;
    head = prevNode;
}



public Node reverseRecursion(Node head){
        if(head == null || head.next == null) {
        return head;
        }
        Node newNode = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
        }




    // main class
    public static void main(String[] args){


        System.out.println("PERFORMING OPERATIONS ON LINKED LIST\n");
        System.out.println("BY USING COLLECTION FRAMEWORK");

        LinkedList<String> LL = new LinkedList<String>();

        System.out.println("\nAdd at first");
        LL.addFirst("a");
        LL.addFirst("is");
        System.out.println(LL);

        System.out.println("\nadd by index");
        LL.add(0, "This");
        System.out.println(LL);

        System.out.println("\nAdd at last");
        LL.addLast("list");
        System.out.println(LL);

        System.out.println("\nPrint size \n " + LL.size());

        System.out.println("\nPrint list");
        for( int i=0; i<LL.size(); i++){
            System.out.print(LL.get(i) + "->");
        }
        System.out.println("NULL");

        System.out.println("\nRemove by index");
        LL.remove(0);
        System.out.println(LL);




        System.out.println("\n\nWITHOUT USING COLLECTION FRAMEWORK");

        main list = new main();

        System.out.println(" \n Add on first");
        list.firstAdd("3");
        list.firstAdd("2");
        list.firstAdd("1");
        list.printList();

        System.out.println("\n Add on last");
        list.lastAdd("4");
        list.lastAdd("5");
        list.printList();


        System.out.println(" \n Delete on first");
        list.firstDelete("");
        list.printList();


        System.out.println(" \n Delete on last");
        list.lastDelete("");
        list.printList();


        System.out.println("\n Print size of LL \n" + list.getSize() + "\n");

        System.out.println("reverse list");
        list.reverseIterate(); //By Itrative method
        list.printList();

        list.head = list.reverseRecursion(list.head);  //by recursive method
        list.printList();
    }
}