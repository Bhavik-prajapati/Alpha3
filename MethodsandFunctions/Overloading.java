package MethodsandFunctions;

public class Overloading {

    public static int sum(int a,int b){
        return a+b;
    }

    public static float sum(float a,float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10.4f,20.2f));
    }
}


