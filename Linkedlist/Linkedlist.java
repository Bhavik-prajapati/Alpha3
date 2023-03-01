package Linkedlist;

import java.util.SimpleTimeZone;

public class Linkedlist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        public static Node head;
        public static Node tail;

    public static int size;

    public void addFirst(int data) {
        //create new node
//        newnode-next=>head
//        head=newnode
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head=newnode;
    }

    public void addLast(int data) {
        //last node.next=newnode
        Node newnode = new Node(data);
        size++;


        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            if(temp.next==null){
                System.out.print(temp.data+"->"+"null");
                temp=temp.next;
            }else{
            System.out.print(temp.data+"->");
            temp = temp.next;
            }
        }
        System.out.println("..");
    }

    public void addAtindex(int data,int idx){
        if(idx==0){
            addFirst(data);
            return;
        }

        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while (i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;

        temp.next=newNode;
    }
    public int removefirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public  int removeLast()
    {
        if(size==0){
            System.out.println("ll is empty");
            return  Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        Node prev=head;
        for (int i = 0; i < size-2; i++) {
            prev=prev.next;
        }

        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }

    public int itrSerch(int key){
        Node temp=head;
        int i=0;
        while (temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
    return -1;
    }

//    recursive search..
    public int helper(Node head, int key) {
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){

        return helper(head,key);

    }

//    reverse ll

    public void reverse(){

        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }



    public void deletenhfromEnd(int n){
        int size=0;
        Node temp=head;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        if(n==size){
            head=head.next;//remove first
            return;
        }
        int i=1;
        int itofind=size-n;
        Node prev=head;
        while (i<itofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkpalindrome(){
        if(head==null|| head.next==null){
            return true;
        }
//        find mid
        Node midnode=findmid(head);
//        rev
        Node prev=null;
        Node curr=midnode;
        Node next;

        while (curr!=null){

            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        while (right!=null){

                if(left.data!=right.data){
                    return false;
                }
                left=left.next;
                right=right.next;
        }
            return true;
    }
    public void zigzag(){
//        find mid
        Node slow=head;
        Node fast=head.next;
        while (fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
        }
        Node mid=slow;
//        rev 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        while (left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;
        }
    }



    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.zigzag();
        ll.print();


//        ll.addLast(10);
//        ll.addLast(20);
//        ll.addLast(30);
//        ll.print();
//        ll.addAtindex(40,2);
//        ll.removefirst();
//    ll.removeLast();
//        ll.print();
//        System.out.println(ll.size);
//        ll.print();
////        System.out.println(ll.itrSerch(40));
//        System.out.println(ll.recursiveSearch(20));
//        ll.print();
//        ll.reverse();
//        ll.print();

//        ll.print();
//        ll.deletenhfromEnd(2);
//        ll.print();
    }

}



