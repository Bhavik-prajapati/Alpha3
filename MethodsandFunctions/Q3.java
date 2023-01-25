package MethodsandFunctions;

import sun.org.mozilla.javascript.internal.ast.ScriptNode;

import java.util.Scanner;

public class Q3 {

    public static boolean isPalindrome(int n){
        int pal=n;
        int rev=0;
        while (pal!=0){
            int rem=pal%10;
            rev=rev*10+rem;
            pal=pal/10;
        }
        if(n==rev){
            return true;
        }

            return false;


    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}
