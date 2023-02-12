package Recursion;

public class Recursion {
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){

        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");

    }
    public static int factorial(int n){

        if(n==0){
            return  1;
        }
        return n*factorial(n-1);
    }
    public static int Sumofn(int n){
        if(n==1){
            return 1;
        }
        return  n+Sumofn(n-1);
    }
    public static int fib(int n){
        if(n==0 || n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static boolean isArraySorted(int[] arr,int i){
        if (i == arr.length - 1) {
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isArraySorted(arr,i+1);
    }
    public static int firstoccurance(int[] arr,int i,int key) {

        if(i==arr.length-1){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }
        return firstoccurance(arr,i+1,key);

    }
    public static int lastoccurance(int[] arr,int key,int i) {
        if(i==arr.length){
            return -1;
        }

        int isFound=lastoccurance(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static int Power(int x,int n)
    {
        if(n==0){
            return 1;
        }
        return x*Power(x,n-1);
    }
//optimized approach of above problem
  public static int OptimizedPower(int a,int n) //ologn
    {
        if(n==0)
        {
            return 1;
        }
        int halfpower=OptimizedPower(a,n/2);
        int halfSquare=halfpower*halfpower;

//        n is odd
        if(n%2!=0){
            halfSquare=a*halfSquare;
        }
        return halfSquare;
    }

    public static int tilingproblem(int n){ //2XN (floor size
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=tilingproblem(n-1);
        //horizontal choice
        int fnm2=tilingproblem(n-2);
        return fnm1+fnm2;
    }

    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicates(str,idx+1,newStr,map);
        }else{
            map[currChar-'a']=true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
        }
    }
    public static int friendspairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendspairing(n - 1) + (n - 1) * friendspairing(n - 2);
    }
    public static void printBinStrings(int n,int lp,String str){
            if(n==0){
                System.out.println(str);
                return;
            }
            printBinStrings(n-1,0,str+"0");
            if(lp==0){
            printBinStrings(n-1,0,str+"1");
            }
    }
    public static void main(String[] args) {
     int  n=10;
//     printDec(n);
//     printInc(n);
//     System.out.println(factorial(5));
//     System.out.println(Sumofn(5));
//        System.out.println(fib(3));
//        int[] arr={1,2,3,3,4,5};
//        System.out.println(isArraySorted(arr,0));
//        System.out.println(firstoccurance(arr,0,3));
//        System.out.println(lastoccurance(arr,3,0));
//        System.out.println(Power(2,5));
//        System.out.println(OptimizedPower(2,5));
//        System.out.println(tilingproblem(4));

//        String str="bbbhavikk";
//        boolean arr[]=new boolean[26];
//        removeDuplicates(str,0,new StringBuilder(""),arr);
//        System.out.println(friendspairing(3));

        String str="";
        printBinStrings(3,0, str);

    }

}
