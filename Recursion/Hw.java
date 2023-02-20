package Recursion;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;

public class Hw {

//    Q1
    public static ArrayList<Integer> printoccurances(int[] arr,int key){

        ArrayList<Integer> occ=new ArrayList<>();

        int counter=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==key){
                occ.add(i);
            }
        }
        return occ;
    }

//    recursion
    public static ArrayList<Integer> printOcc(int[] arr,int key,int i,ArrayList<Integer> ans){
        if(i==arr.length){
            return ans;
        }

        if(arr[i]==key){
            ans.add(i);
        }
        printOcc(arr,key,i+1,ans);
        return ans;
    }

//using recursion approach professional
    public static void alloccurances(int[] arr,int key,int i)
    {
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        alloccurances(arr,key,i+1);
    }

//    Q-2

    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
//    public static void printDigits(int n){
//        while (n>0){
//            int ld=n%10;
//            System.out.println(digits[ld]);
//            n=n/10;
//        }
//    }
//    using recursion
    public static void printDigits(int n){
        if(n==0){
            return;
        }

        int lg=n%10;
        printDigits(n/10);
        System.out.print(digits[lg]+" ");

    }
//    Q-3
    public static int Strlenfun(String s){
        if(s.length()==0){
            return 0;
        }
        return Strlenfun(s.substring(1))+1;
    }
//    Q-4

    public static int countSubstrings(String s,int i,int j,int n){

        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int res=countSubstrings(s,i+1,j,n-1)+
                countSubstrings(s,i,j-1,n-1)-
                countSubstrings(s,i+1,j-1,n-2);
        if(s.charAt(i)==s.charAt(j)){
            res++;
        }
        return res;

    }
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("transfer disk "+n +"from "+src+" to "+helper);
        towerOfHanoi(n-1,helper,src,dest);
    }




    public static void main(String[] args) {
//        int  arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
//        int key=2;
//        ArrayList<Integer> ans=new ArrayList<>();
//        ans=printOcc(arr,key,0,ans);
//        System.out.println(ans);
//        alloccurances(arr,key,0);
//        printDigits(12340);
//        System.out.println(Strlenfun("hello"));
//        String s="abcab";
//        System.out.println(countSubstrings(s,0,s.length()-1,s.length()));

//        int n=4;
//        towerOfHanoi(n,"A","B","C");







    }
}
