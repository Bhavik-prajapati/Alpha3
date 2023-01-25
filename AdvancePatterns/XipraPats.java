package AdvancePatterns;
import java.util.Scanner;

public class XipraPats {

    public static void Pattern1(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void Pattern3(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern4(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(i*j);
            }
            System.out.println();
        }
    }
    public static void Pattern5(int n){
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=n; j++) {
                System.out.print(i*j);
            }
            System.out.println();
        }
    }

    public static void Pattern6(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern7(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void Pattern8(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern9(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i*j);
            }
            System.out.println();
        }
    }
    public static void Pattern10(int n){
        int counter=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    public static void Pattern11(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern12(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(n-j+1);
            }
            System.out.println();
        }
    }
    public static void Pattern13(int n){
        for (int i = n; i >=1; i--) {
            for (int j = i; j <=n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern14(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

    public static void Pattern15(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.println("*");
            }          System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        int n=4;
//        Pattern1(n);
//        Pattern2(n);
//        Pattern3(n);
//        Pattern4(n);
//        Pattern5(n);
//        Pattern6(n);
//        Pattern7(n);
//        Pattern8(n);
//        Pattern9(n);
//        Pattern10(n);
//        Pattern11(n);
//        Pattern12(n);
//        Pattern13(n);
//        Pattern14(n);

    }
}

