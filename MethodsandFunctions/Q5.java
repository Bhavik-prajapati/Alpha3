package MethodsandFunctions;

import java.util.Scanner;

public class Q5 {
    public static int sumofDigit(int n){

        int ans=0;
        while (n>0){
            int rem=n%10;
            ans+=rem;
            n=n/10;
        }
        return ans;

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumofDigit(n));

    }
}
