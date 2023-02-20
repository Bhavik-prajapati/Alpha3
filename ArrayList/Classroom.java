package ArrayList;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
//        ArrayList<String> list2=new ArrayList<>();
//        ArrayList<Boolean> list3=new ArrayList<>();

//        0(1)
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(6);
//        System.out.println(list);
//        0(1)
//        System.out.println(list.get(2));
//        0(n)
//        list.remove(2);
//        System.out.println(list);
//O(n)
//        list.set(2,10);
//        System.out.println(list);
//        System.out.println(list.contains(1));
//        O(n)
//        list.add(2,10);
//        System.out.println(list);
//        System.out.println(list.size());
//        reverse print
//        for (int i = list.size()-1; i >=0; i--) {
//            System.out.print(list.get(i)+" ");
//        }
//        max
//        int max=Integer.MIN_VALUE;
//        for (int i = 0; i <list.size() ; i++) {
//            if(max<list.get(i)){
//                max=list.get(i);
//            }
//            max=Math.max();
//        }
//        System.out.println(max);

        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);

        ArrayList<Integer> a2=new ArrayList<>();
        a2.add(4);
        a2.add(5);
        a2.add(6);

        ArrayList<Integer> a3=new ArrayList<>();
        a3.add(7);
        a3.add(8);
        a3.add(9);

        arr.add(a1);
        arr.add(a2);
        arr.add(a3);

        for (int i = 0; i <arr.size() ; i++) {
            ArrayList<Integer> currlist=arr.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j));
            }
            System.out.println();
        }
        System.out.println(arr);


    }
}
