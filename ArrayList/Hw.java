package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Hw {


//    Monotonic ArrayList(EASY)An Arraylist is monotonic if it is either monotone\
//    increasing or monotone decreasing.AnArraylistnumsismonotoneincreasingifforalli<=j,nums.get(i)<=nums.get(j).AnArraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).Given an integer Arraylist nums,
//    return true if the given list is monotonic, or false otherwise


    public static  boolean ismonotoneincreasingorDec(ArrayList<Integer> arr){
        boolean inc=true;
        boolean dec=true;

        for (int i = 0; i < arr.size()-1; i++) {
            if(arr.get(i)>arr.get(i+1)){
                inc=false;
            }
            if(arr.get(i)<arr.get(i+1)){
                dec=false;
            }
        }
        return inc||dec;
    }
//Lonely Numbers

    public static ArrayList<Integer> lonelyNumber(ArrayList<Integer> arr) {
        Collections.sort(arr);
        ArrayList<Integer> a1=new ArrayList<>();

        for (int i = 1; i <arr.size()-1 ; i++) {

            if(arr.get(i-1)+1<arr.get(i) && arr.get(i)+1<arr.get(i+1)){
                a1.add(arr.get(i));
            }
        }

        if(arr.size()==1){
            a1.add(arr.get(0));
        }
        if(arr.size()>1){
            if(arr.get(0)+1<arr.get(1)){
                a1.add(arr.get(0));
            }
            if(arr.get(arr.size()-2)+1<arr.get(arr.size()-1)){
                a1.add(arr.get(arr.size()-1));
            }
        }
        return a1;
    }

//    Most Frequent Number following Key
    private static int mostFrequent(ArrayList<Integer> arr, int key) {
        int[] result=new int[1000];
        for (int i = 0; i < arr.size()-1; i++) {
            if(arr.get(i)==key){
                result[arr.get(i+1)-1]++;
            }
        }
        int max=Integer.MIN_VALUE;
        int ans=0;
        for (int i = 0; i < 1000; i++) {
            if(result[i]>max){
                max=result[i];
                ans=i+1;
            }
        }
        return ans;
    }
//    Beautiful array
//    bruteforce

    public static ArrayList<Integer> beautifulArr(int n){

        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);
        for (int i = 2; i <=n ; i++) {
            ArrayList<Integer> temp=new ArrayList<>();
            for (Integer e:ans) {
                if(2*e<=n){
                    temp.add(e*2);
                }
            }
            for (Integer e:ans) {
                if(2*e-1<=n){
                    temp.add(e*2-1);
                }
            }
    ans=temp;
        }
    return ans;
    }

//divide and conquer
    public static ArrayList<Integer> beautifulArr1(int n){

        ArrayList<Integer> res=new ArrayList<>();
        divideandConquer(1,1,res,n);
        return res;

    }

    private static void divideandConquer(int start, int inc, ArrayList<Integer> res, int n) {

        if(start+inc>n){
            res.add(start);
            return;
        }
        divideandConquer(start,2*inc,res,n);
        divideandConquer(start+inc,2*inc,res,n);


    }


    public static void main(String[] args) {
//        ArrayList<Integer> arr=new ArrayList<>();
//        arr.add(1);
//        arr.add(100);
//        arr.add(200);
//        arr.add(1);
//        arr.add(100);
//        System.out.println(ismonotoneincreasingorDec(arr));
//        ArrayList<Integer> ans=new ArrayList<>();
//        ans=lonelyNumber(arr);
//        System.out.println(ans);
//        int key=1;
//        System.out.println(mostFrequent(arr,key));

//        System.out.println(beautifulArr(6));
        System.out.println(beautifulArr1(6));



    }




}

