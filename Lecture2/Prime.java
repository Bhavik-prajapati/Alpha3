package Lecture2;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2){
            System.out.println(n+" is prime");
        }else{
            boolean isprime=true;
            for (int i = 2; i <Math.sqrt(n); i++) {
                if(n%i==0){
                    isprime=false;
//                    break;
                }
            }

            if(isprime){
                System.out.println(n+" is prime" );
            }else{
                System.out.println("not prime");
            }
        }
    }
}
