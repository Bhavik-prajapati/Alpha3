package Heaps;

import java.util.ArrayList;

public class Heaps_ {

    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data){
            //add at last
            arr.add(data);
            int x=arr.size()-1;
            int parent=(x-1)/2;
            while (arr.get(x)<arr.get(parent)){
                int temp=arr.get(x);
                arr.set(x,arr.get(parent));
                arr.set(parent,temp);

                x=parent;
                parent=(x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void hepify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;
            if(left<arr.size()&&arr.get(minidx)>arr.get(left)){
                minidx=left;
            }
            if(right<arr.size() && arr.get(minidx)>arr.get(right)){
                minidx=right;
            }

            if(minidx!=i){
                int temp=arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp);
                hepify(minidx);
            }


        }



        public int remove(){
            int data=arr.get(0);
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            //step-2
            arr.remove(arr.size()-1);
            //hepify
            hepify(0);
            return data;

        }

        public boolean isEmpty(){
            return arr.size()==0;
        }

    }
    public static void main(String[] args) {
        Heap pq=new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);
        while (!pq.isEmpty())
        {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}