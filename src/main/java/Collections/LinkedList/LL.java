package Collections.LinkedList;

public class LL {
    private Node head; //reference variable pointing to next node.
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail=node;
        size++;
    }
    public void insertFirst(int val){
        Node node= new Node(val);
        node.next= head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size+=1;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("End");
    }
    private class  Node{
        private int value;
        private Node next;

        public void setNext(Node next) {
            this.next = next;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
        public Node(int value){
            this.value=value;
        }
    }
}
