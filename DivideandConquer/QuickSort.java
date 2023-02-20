package DivideandConquer;

import java.util.Arrays;

public class QuickSort {


    public static void QuickSort(int[] arr,int si,int ei){


        if(si>=ei){
            return;
        }
        int pidx=partition(arr,si,ei);
        QuickSort(arr,si,pidx-1);
        QuickSort(arr,pidx+1,ei);
    }

    private static int partition(int[] arr, int si, int ei) {

        int pivot=ei;
        int i=si-1;
        for (int j = si; j <ei ; j++) {

            if(arr[j]<=pivot){
                i++;
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
