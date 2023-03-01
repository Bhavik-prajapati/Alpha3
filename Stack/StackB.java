package Stack;

import java.util.ArrayList;

public class StackB {

    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
//        push
        public  void push(int data){
            list.add(data);
        }
//      pop
        public  int pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
//        peek
        public  int peek(){
            int top=list.get(list.size()-1);
            return top;
        }

    }


    public static void main(String[] args) {
        Stack s1= new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);

        while (!s1.isEmpty())
        {
            System.out.println(s1.peek());
            s1.pop();
        }





    }
}

