package Heaps;

import java.util.ArrayList;
import java.util.Arrays;

public class HeapSort {

    public static void hepify(int[] arr,int i,int size)
    {

        int left=2*i+1;
        int right=2*i+2;

        int maxidx=i;

        if(left<size && arr[left]>arr[maxidx]){
            maxidx=left;
        }

        if(right<size && arr[right]>arr[maxidx]){
            maxidx=right;
        }

        if(maxidx!=i){
            int temp=arr[i];
            arr[i]=arr[maxidx];
            arr[maxidx]=temp;
            hepify(arr,maxidx,size);
        }




    }

    public static void heapSort(int []arr){
        int n=arr.length;
        for (int i = n/2; i >=0 ; i--) {
            hepify(arr,i,n);
        }

        for (int i = n-1; i >0 ; i--) {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            hepify(arr,0,i);
        }




    }

    public static void main(String[] args) {
    int arr[]={1,2,3,5,4};
    heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
