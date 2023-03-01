package Linkedlist;

public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){

        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;

    }
    public int removefirst(){
        if(head==null){
            System.out.println("DLL IS EMPTY");
            return Integer.MIN_VALUE;

        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;



    }
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println(" ");
    }

//    reverse dll

//    --remaining---

    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);

//        dll.removefirst();
        dll.print();
        System.out.println("hellow orld");
//        dll.reverse();

        dll.print();
    }
}
