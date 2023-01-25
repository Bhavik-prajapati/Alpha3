package AdvancePatterns;

import Patterns.Rhombus;

import javax.swing.*;
import java.beans.XMLEncoder;
import java.util.PropertyPermission;
import java.util.Scanner;

public class ADVPatterns {


    public static void hollow_retangle(int rows,int cols){

        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=cols; j++) {

                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    
    
    public static void halfPyramid(int rows,int cols){
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void InvertedHalfPyramid(int rows,int cols){
        for (int i = 1; i <=rows; i++) {
            for (int spaces = 1; spaces <=rows-i; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void InvertedHalfPyramidNumbers(int rows){

        for (int i = 1; i <=rows; i++) {

            for (int j = 1; j <=rows-i+1 ; j++) {

                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void FloydPattern(int rows){
        int counter=1;
        for (int i = 1; i <=rows; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(counter);
                counter++;
            }
            System.out.println("");
        }
    }

    public static void Zero_one_Triangle(int rows){

        for (int i = 1; i <=rows; i++) {

            for (int j = 1; j <=i ; j++) {
                if ((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println("");
        }
    }

    public static void Butterfly_Pattern(int n){

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            for (int spaces = 0; spaces <=(2*(n-i)) ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = n; i >=1; i--) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            for (int spaces = 0; spaces <=(2*(n-i)) ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void Solid_Rhoumbus(int n){

        for (int i = 1; i <=n; i++) {

            for (int spaces = 0; spaces <=((n-i)) ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void Hollow_Rhoumbus(int n){

        for (int i = 1; i <=n; i++) {

            for (int spaces = 0; spaces <=((n-i)) ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
     public static void DiamondPattern(int n){

        for (int i = 1; i <=n; i++) {

            for (int spaces = 0; spaces <=((n-i)) ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i)-1 ; j++) {
                    System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void NumberPyramid(int n){

        for (int i = 1; i <= n; i++) {

            for (int k = 0; k < (n-i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }

    public static void PalindromicPattern(int n){

        for (int i = 1; i <= n; i++) {

            for (int k = 0; k < (n-i); k++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        int col=sc.nextInt();
//        hollow_retangle(row,col);
//        halfPyramid(row,col);
//        InvertedHalfPyramid(row,col);
//        InvertedHalfPyramidNumbers(row);
//        FloydPattern(n);
//        Zero_one_Triangle(n);
//    Butterfly_Pattern(n);
//        Solid_Rhoumbus(n);

//        Hollow_Rhoumbus(n);
//        DiamondPattern(n);
//        NumberPyramid(n);
        PalindromicPattern(n);
    }


}
