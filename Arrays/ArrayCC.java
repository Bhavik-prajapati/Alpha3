package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCC {
        public  static  int LinearSearch(String arr[],String key){
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i].equals(key))
                {
                    return i;
                }
            }
                return -1;
        }

    public static int getLargest(int arr[]){
        int largest=Integer.MIN_VALUE;//-infinity
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(largest < arr[i]){
                largest=arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println("smallest number is "+ smallest);
        return largest;
    }

    public static int BinarySearch(int arr[],int key){

            int start=0;
            int end=arr.length-1;

            while (start<=end){
                int mid=(start+ end)/2;
                if(arr[mid]==key){
                    return mid;
                }
                if(arr[mid]<key)
                {
                    start=mid+1;
                }else
                {
                    end=mid-1;
                }
            }
            return -1;
    }

    public static void swap(int i,int j){
            int temp=i;
            i=j;
            j=temp;
    }
    public static void ReverseArray(int[] arr){
            int first=0;
            int last=arr.length-1;

            while (first<last){

                int temp=arr[last];
                arr[last]=arr[first];
                arr[first]=temp;

                first++;
                last--;
            }
    }

    public  static void  PrintPairs(int[] arr)
    {
        int totalpairs=0;
        for (int i = 0; i <arr.length; i++) {
            int current=arr[i];
            for (int j = i+1; j <arr.length ; j++) {
                System.out.print("("+current+","+arr[j]+")");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs "+totalpairs);
    }

    public static void PrintSubArray(int[] arr){
            int ts=0;
            int sum=0;

        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j <arr.length ; j++) {
                int last=j;
                for (int k = start; k <=last ; k++) {
                    System.out.print(arr[k]+" ");
                }
                    ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays = "+ts);


    }

//    MaxSubArraySum - Brureforce approch
    public static void MaxSubArraySum(int arr[]){

            int currSum=0;
            int MaxSum=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j <arr.length ; j++) {
                currSum=0;
                int last=j;
                if(MaxSum<currSum){
                    for (int k = start; k <=last ; k++) {
//                    System.out.print(arr[k]+" ");
                        currSum+=arr[k];
                    }
                    System.out.println(currSum);
                    MaxSum=currSum;
                }
            }
        }
        System.out.println("max sum "+MaxSum);
    }

    //     MaxSubArraySum - PrefixSum Method approch

    public static void MaxSubArraySum_PrefixSum(int[] arr){
        int Currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int[] prefix=new int[arr.length];
//        calculate prefix array
        prefix[0]=arr[0];
        for (int i = 1; i <prefix.length ; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }



        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j <arr.length ; j++) {
                int last=j;
                Currsum=start==0?prefix[last] :prefix[last]-prefix[start-1];

                System.out.println(Currsum);
                if(maxsum<Currsum){
                    maxsum=Currsum;
                }
            }
        }
        System.out.println("max is "+maxsum);
    }
    //     MaxSubArraySum - Kadane's Algorithm approch
        public static void Kadanes(int[] arr){

            int ms=Integer.MIN_VALUE;
            int curr=0;

            for (int i = 0; i < arr.length; i++) {
                curr+=arr[i];
                if(curr<0){
                    curr=0;
                }
                ms=Math.max(curr,ms);

            }
            System.out.println("max subarray sum is "+ms);
        }




    public static void main(String[] args) {
//        String[] fruits ={"apple","mango","orange"};
//        String key="mango";
//        System.out.println(LinearSearch(fruits,key));
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
//        System.out.println(BinarySearch(arr,36));
//        System.out.println("Largest number is "+ getLargest(arr));
//        System.out.println(Arrays.toString(arr));
//        ReverseArray(arr);
//        System.out.println(Arrays.toString(arr));
//        PrintPairs(arr);
//        PrintSubArray(arr);
        MaxSubArraySum(arr);
//        MaxSubArraySum_PrefixSum(arr);
//        Kadanes(arr);
    }
}
