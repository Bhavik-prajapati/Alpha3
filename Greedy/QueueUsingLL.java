package Greedy;

import Linkedlist.Linkedlist;

public class QueueUsingLL {

    static class Node{
        int data;
        Node next;
        Node(int data){
           this.data=data;
           this.next=null;
        }
    }

    static class Queue{

        static Node head=null;
        static Node tail=null;


        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public void add(int data){

            Node newnode=new Node(data);

            if(head==null){
                head=tail=newnode;
                return;
            }

            tail.next=newnode;
            tail=newnode;

        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            int front=head.data;
            if(tail==head){
                tail=head=null;
            }
            else{
                head=head.next;
            }
            return front;
        }


        public static int peek(){

            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return head.data;
        }

        public void printqueue(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
    }


    public static void main(String[] args) {

        Queue q1=new Queue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.printqueue();
//        while (!q1.isEmpty()){
//            System.out.println(q1.peek());
//            q1.remove();
//        }

        System.out.println("");

        q1.remove();
        q1.printqueue();






    }
}


