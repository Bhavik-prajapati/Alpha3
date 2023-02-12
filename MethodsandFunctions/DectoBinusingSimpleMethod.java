package MethodsandFunctions;

import java.util.Arrays;

public class DectoBinusingSimpleMethod {
    public static void main(String[] args) {

        int n=12;
        int i=0;
        int arr[]=new int[32];
        while (n>0){
            int rem=n%2;
            n=n/2;
            arr[i]=rem;
            i++;
        }

        System.out.println(Arrays.toString(arr));

        for (int j = arr.length-1; j>=0 ; j--) {
            System.out.print(arr[j]);
        }
    }
}
