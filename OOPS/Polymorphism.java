package OOPS;

class Calculator{
//    method overriding....
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}

//overriding..
class Animal1{
    void eat(){
        System.out.println("eat anything..");
    }
}
class Deer extends Animal{
    @Override
    void eat() {
        System.out.println("eats grass");
    }
}


public class Polymorphism {

    public static void main(String[] args) {
//        Calculator cl=new Calculator();
//        System.out.println(cl.sum(1,5));
//        System.out.println( cl.sum((float) 1.2,(float) 5.4));
//        System.out.println(cl.sum(1,2,4));
        Deer d1=new Deer();
        d1.eat();

    }
}
