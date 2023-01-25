package MethodsandFunctions;

import java.util.Scanner;

public class Q1 {

    public static double average(double x,double y,double z){
        return x+y+z/3;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();
        System.out.println(average(x,y,z));


    }
}
