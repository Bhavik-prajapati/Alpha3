package Greedy;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueusingJCF {

    public static void main(String[] args) {


//        Queue<Integer> q1=new LinkedList<>();
//        q1.add(1);
//        q1.add(2);
//        q1.add(3);
//        while (!q1.isEmpty()){
//            System.out.print(q1.peek());
//            q1.remove();
//        }
//        System.out.println();
//        q1.remove();
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()){
            System.out.print(q.peek());
            q.remove();

        }

    }


}


