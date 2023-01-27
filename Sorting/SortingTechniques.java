package Sorting;
import  java.util.Arrays;
import java.util.Collections;
public class SortingTechniques {

    public static void BubbleSort(Integer[] arr){
        for (int turn = 0; turn < arr.length-1; turn++) {
            for (int j = 0; j < arr.length-1-turn; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void OptimizedBubbleSort(Integer[] arr){
        for (int turn = 0; turn < arr.length-1; turn++) {
            boolean swapped=false;
            for (int j = 0; j < arr.length-1-turn; j++) {

                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }

        }
    }
    public static void SelectionSort(Integer[] arr){
        for (int i = 0; i < arr.length-1; i++) {
        int minPositon=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[minPositon]>arr[j])
// for desc                if(arr[minPositon]<arr[j])
                {
                    minPositon=j;
                }
            }
            int temp=arr[minPositon];
            arr[minPositon]=arr[i];
            arr[i]=temp;
        }
    }
    public static void InsertionSort(Integer[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int curr=arr[i];
            int prev=i-1;
//            find correct positon
            while (prev>=0 && arr[prev]>curr){
//  Descending          while (prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
//            insertion
            arr[prev+1]=curr;
        }
    }

        public static void PrintArray(Integer[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

//    inbuild sort
//    Arrays.sort(arr);
//     Arrays.sort(arr,0,4);
//        Arrays.sort(arr,Collections.reverseOrder());
//        Arrays.sort(arr,0,3,Collections.reverseOrder());



//    public static int compare(int a,int b){
////        if(a<b) -ve
////        if(a==b) 0
////        if(a>b) +ve
////        return a-b;
////        return b-a;
//    }

    public static void CountingSort(Integer[] arr){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>largest){
//                largest=arr[i];
//            }
            largest=Math.max(largest,arr[i]);
        }
        int[] count=new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j=0;

        for (int i = 0; i < count.length; i++) {
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }




    public static void main(String[] args) {
        Integer arr[]={1,5,3,6,3,6,3,4,5};
//        BubbleSort(arr);
//        SelectionSort(arr);
//        InsertionSort(arr);
//        Arrays.sort(arr);

//        Arrays.sort(arr,0,4);
//        Arrays.sort(arr,Collections.reverseOrder());
//        Arrays.sort(arr,0,3,Collections.reverseOrder());

        CountingSort(arr);
        PrintArray(arr);






    }
}
