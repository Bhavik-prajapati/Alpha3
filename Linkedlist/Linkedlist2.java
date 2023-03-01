package Linkedlist;

public class Linkedlist2 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node newnode=new Node(data);

        if(head==null){
            head=tail= newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void print(){
        Node temp=head;
        while (temp!=null){
            if(temp.next==null){
                System.out.print(temp.data+"->"+"null");
                temp=temp.next;
            }else{
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
        System.out.println();
    }

    public void addFirst(int data){
        Node Newnode=new Node(data);
        if(head==null){
            head=tail=Newnode;
            return;
        }
        Newnode.next=head;
        head=Newnode;
    }

//    FLOYD S ALGO
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while (fast!=null&& fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
//    remove a loop or cycle
//    find last node then make it point to null

    public static void removeCycle(){
//        detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }

        }
        if(cycle==false){
            return;
        }
//        find meet point
        slow=head;
        Node prev=null;
        while (slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
//        remove
        prev.next=null;
    }

    public static void main(String[] args) {

        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());


    }
}
