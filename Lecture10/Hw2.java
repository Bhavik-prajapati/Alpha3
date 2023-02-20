package Lecture10;


import java.util.Scanner;


//Q-2 -> Write a program that reads a set of integers,and then prints the sum of the even and odd integers

public class Hw2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int choice,even=0,odd=0;
        do{

            System.out.println("enter number: ");
            int n=sc.nextInt();
            if(n%2==0){
                even+=n;
            }else {
                odd+=n;
            }
            System.out.println("for continue yes-1 and no-0");
            choice=sc.nextInt();

        }while (choice==1);
        System.out.println("sum of even  "+even);
        System.out.println("sum of odd "+odd);


    }
}
