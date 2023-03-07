package Backtracking;

public class Backtracking {


    public static void PrintArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void changeArray(int[] arr,int i,int val){

        if(i==arr.length){
            PrintArr(arr);
            return;
        }

        arr[i]=val;
        changeArray(arr,i+1,val+1);
        arr[i]=arr[i]-2;

    }

    public static void findSubsets(String str,String ans, int i){
        //base case
        if(i==str.length()){

            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }

            return;
        }
        //recursion
        findSubsets(str,ans+str.charAt(i),i+1);
        findSubsets(str,ans,i+1);
    }


    public static void findPermutation(String str,String ans){//0(n*n!)

        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);
            String Newstr=str.substring(0,i)+str.substring(i+1);
            findPermutation(Newstr,ans+curr);

        }
    }


    public static void main(String[] args) {

//        int[] arr=new int[5];
//        changeArray(arr,0,1);
//        PrintArr(arr);
        String str="abc";
        findPermutation(str,"");
//        findSubsets(str,"",0);




    }
}
