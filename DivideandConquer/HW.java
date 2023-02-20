//package DivideandConquer;
//
//
//import java.util.Arrays;
//
//public class HW {
//
////    Q1=ApplyMergesort to sort an array of Strings.(Assume that all the characters in all the Strings are in lowercase). (EASY)
//    public static String[] mergeSort(String[] arr, int low, int high) {
//        if(low==high){
//            String[] A={arr[low]};
//            return A;
//        }
//        int mid=low+(high-low)/2;
//        String[] arr1=mergeSort(arr,low,mid);
//        String[] arr2=mergeSort(arr,mid+1,high);
//        String[] arr3=merge(arr1,arr2);
//        return arr3;
//    }
//
//    public static String[] merge(String[] arr1,String[] arr2){
//        int m=arr1.length;
//        int n=arr2.length;
//        String[] arr3=new String[m+n];
//        int idx=0;
//        int i=0;
//        int j=0;
//
//        if(i<m && j<n){
//            if(isAlphabeticallySmaller(arr1[i],arr2[j])){
//                arr3[idx]=arr1[i];
//                i++;
//                idx++;
//            }else{
//                arr3[idx]=arr2[j];
//                j++;
//                idx++;
//            }
//        }
//
//        while (i<m){
//            arr3[idx]=arr1[i];
//            i++;
//            idx++;
//        }
//
//        while (j<n){
//            arr3[idx]=arr2[j];
//            j++;
//            idx++;
//        }
//
//        return arr3;
//    }
//
//    public static boolean isAlphabeticallySmaller(String s1, String s2) {
//
//        if(s1.compareTo(s2)<0){
//            return true;
//        }
//        return false;
//    }
//
////    Q-2 majorityElement
////    Bruteforce approach
////     static int majorityElement(int[] nums) {
////        int majoritycount=nums.length/2;
////         for (int i = 0; i <nums.length ; i++) {
////             int count=0;
////             for (int j = 0; j < nums.length; j++) {
////                 if(nums[j]==nums[i]){
////                     count+=1;
////                 }
////             }
////             if(count>majoritycount){
////                 return nums[i];
////             }
////         }
////
////             return -1;
////    }
////optimized approach
//
//
//    public static int majorityElement(int[] nums){
//        return majorityElement(nums,0,nums.length-1);
//    }
//
//    public static void main(String[] args) {
//
////        Q-1
////        String[] arr ={ "a","c","b","z"};
////        String[] ans=mergeSort(arr,0,arr.length-1);
////
////        for (int i = 0; i < ans.length; i++) {
////            System.out.print(ans[i]+" ");
////        }
////      Q-2
//        int[] nums = {2,2,1,1,1,2,2};
//        System.out.println(majorityElement(nums));
//
//
//
//
//    }
//
//
//
//
//}
