package MethodsandFunctions;

public class BinomialCoeff {


    public  static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int BinCoef(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_n_r=fact(n-r);
        int bincoe=fact_n/(fact_r*fact_n_r);
        return  bincoe;
    }

    public static void main(String[] args) {
        System.out.println(BinCoef(5,2));
    }
}
