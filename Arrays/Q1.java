package Arrays;

import java.util.HashSet;

public class Q1
{
    public  static boolean CheckDistinct(int[] arr){

        int curr=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

//    optimize approach

    public static boolean containsDuplicate(int[] arr){
        HashSet<Integer> h1=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(h1.contains(arr[i])){
                return true;
            }else{
                h1.add(arr[i]);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(CheckDistinct(arr));




    }
}
