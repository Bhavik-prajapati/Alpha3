package MethodsandFunctions;

public class BintoDec {
    public static void BintoDec(int binNum){
        int pow=0;
        int decNum=0;
        while (binNum>0){
            int ld=binNum%10;
            decNum=decNum+(ld*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of "+" = "+decNum);
    }
    public static void main(String[] args) {
//        BintoDec(10);
        BintoDec(12);

    }
}
