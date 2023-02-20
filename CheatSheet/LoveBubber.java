package CheatSheet;

//import sun.util.TimeZoneNameUtility;

import java.util.*;

public class LoveBubber {

//    Reverse the array
    public static void reverseArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
    }
//    Find the maximum and minimum element in an array
    public static void getMinMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("(min= "+min+",max= " +max+")");

    }
//    Find the “Kth” max and min element of an array
    public static void kthSmallestandLargestElement(int[] arr,int k){
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[n-k]);
        System.out.println(arr[k-1]);
    }

//    Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

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

//        System.out.println(Arrays.toString(arr));
    }


//Move all negative elements to end
    public static void segregateElements(int arr[], int n)
    {
        ArrayList<Integer> pos=new ArrayList<Integer>();
        ArrayList<Integer> neg=new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }
        pos.addAll(neg);


        int count=0;
        for(int x:pos){
            arr[count]=x;
            count++;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }

    }


//    Union of two arrays
    public static int doUnion(int a[], int n, int b[], int m)
    {

        Set<Integer> hash_Set = new HashSet<Integer>();
        for (int i = 0; i <n ; i++) {
            hash_Set.add(a[i]);
        }
        for (int i = 0; i <m ; i++) {
            hash_Set.add(b[i]);
        }

//        System.out.println(hash_Set.size());
        return hash_Set.size();

    }
//    Write a program to cyclically rotate an array by one.
    public static void rotate(int[] arr, int n)
    {   ArrayList<Integer> a1=new ArrayList<>();
        a1.add(arr[n-1]);
        for (int i = 0; i < n-1; i++) {
            a1.add(arr[i]);
        }
        int count=0;
        for(int x:a1){
            arr[count]=x;
            count++;
        }


    }
//    Find Largest sum contiguous Subarray [V. IMP]
//    Kadane's Algorithm

    public static long maxSubarraySum(int arr[]){

        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < arr.length; i++) {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;

            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;



    }
//    Minimum no. of Jumps to reach end of an array
//    Minimum number of jumps
        public static int minJumps(int[] arr){
            int n=arr.length;
            int counter=0;
            int i=0;

            while (counter==n){
                if(arr[i]==0){
                    break;
                }
                counter+=arr[i];
                i++;
            }
            System.out.println(counter);
            return -1;
        }

//Minimize the maximum difference between heights [V.IMP]
//Minimize the Heights II

    public static int getMinDiff(int[] arr, int n, int k) {

        Arrays.sort(arr);


        System.out.println(Arrays.toString(arr));
        int ans=arr[n-1]-arr[0];

        int tempmin=arr[0];
        int tempmax=arr[n-1];

        for (int i = 0; i <n ; i++) {
            if(arr[i]-k<0){
                continue;
            }
            tempmin=Math.min(arr[0]+k,arr[i]-k);
            tempmax=Math.max(arr[i-1]+k,arr[n-1]-k);

            ans= Math.max(arr[i-1]+k,arr[n-1]-k);
            ans=Math.min(ans, tempmax-tempmin);
        }
        return ans;
    }
//    Strings

//    Reverse a String

    public static String reverseWord(String str)
    {
            StringBuilder s1=new StringBuilder("");
            for (int i = str.length()-1; i >=0 ; i--) {
                s1.append(str.charAt(i));
            }

            return String.valueOf(s1);

    }

//    Palindrome String
    public static int isPalindrome(String S) {
        int s=0;
        int e=S.length()-1;
        while (s<e){
            if(S.charAt(s)==S.charAt(e)){
                s++;
                e--;
            }else{
                return 0;
            }
        }
        return 1;
    }
//   Find Duplicate characters in a string
static final int NO_OF_CHARS = 256;

    static void fillCharCounts(String str,
                               int[] count)
    {
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;

        System.out.println(Arrays.toString(count));
    }

    public static int printDups(String S) {
        int count[] = new int[NO_OF_CHARS];
        fillCharCounts(S,count);

        for (int i = 0; i < NO_OF_CHARS; i++){
            if(count[i]>1)
            {
                System.out.println((char)(i)+" count "+count[i]);
            }
        }


        return 1;
    }
//    Check if strings are rotations of each other or not
//    public static boolean areRotations(String s1, String s2 )
//    {
//
//
//    }

    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5};
//        reverseArray(arr);
//        getMinMax(arr);
//        int[] arr={7, 10, 4, 3, 20, 15};
//        kthSmallestandLargestElement(arr,4);
//        int[] arr={1 ,-1 ,3 ,2 ,-7 ,-5 ,11 ,6};
//        int n=arr.length;
//        segregateElements(arr,n);
//        int[] arr1={85,25,1,32,54,6,85,2 };
//        int[] arr2={85,2 };
//        System.out.println(doUnion(arr1,arr1.length,arr2,arr2.length));
//        int[] arr= {1, 2, 3, 4, 5};
//        rotate(arr,arr.length);

//        int[] arr = {1,2,3,-2,5};
//        System.out.println(maxSubarraySum(arr));
//        int[] arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} ;
//        System.out.println(minJumps(arr));
//        int[] arr={3, 9, 12, 16, 20};
//        int[] arr={2,6,3,4,7,2,10,3,2,1};
//        int k=5;
//        System.out.println(getMinDiff(arr,arr.length,k));

//String
//        System.out.println(reverseWord("helloworld"));

//        System.out.println(isPalindrome("nayan"));

//        String str = "bhavik is good boy";
//        printDups(str);

//        System.out.println(areRotations("geeksforgeeks","forgeeksgeeks"));

    }

}


