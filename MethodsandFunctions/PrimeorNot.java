package MethodsandFunctions;

public class PrimeorNot {
//    only for n>=2
    public static  boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for (int i = 2; i <=n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

//    optimized technique...

    public static boolean isPrime1(int n){
        if(n==2){
            return true;
        }


        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                return  false;
            }

        }
            return true;
    }
    public static void PrimeInrange(int n){
        for (int i = 2; i <=n ; i++) {
            if(isPrime1(i)){
                System.out.print(i+" ,");
            }

        }
        System.out.println();
    }


    public static void main(String[] args) {
//        System.out.println(isPrime(3));
//        System.out.println(isPrime1(12));
//        System.out.println(isPrime1(5));


//        prime in range
        PrimeInrange(30);


    }
}
