package Stack;

public class StackUsingLL {

    static class Node{
        int data;
        Node next;
        Node(int data){ 
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
            static Node head=null;
            public  boolean isEmpty(){
                return head==null;
            }

            public  void push(int data){
                Node newNode=new Node(data);
                if(isEmpty()){
                    head=newNode;
                    return;
                }
                newNode.next=head;
                head=newNode;
            }

            public  int pop(){
                if(isEmpty())
                {
                    return -1;
                }
                int top= head.data;
                head=head.next;
                return top;
            }
            public int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;
            }

    }
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        while (!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }


    }
}
