package OOPS;

abstract class Animal2{
    String color;
    Animal2(){
        System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("animals eats...");

    }
    abstract void walk();
}
class Horse extends Animal2{
    Horse(){
        System.out.println("Horsse constructor called");
    }

    @Override
    void walk() {
        System.out.println("walk on 4 legs ");
    }
    void changecolor(){
        color="dark brown";
    }
}
class  Mustange extends  Horse{
    @Override
    void walk() {
        System.out.println("walk on two legs..");
    }
    Mustange(){
        System.out.println("mustange constructor called");
    }

}

public class Abstraction {

    public static void main(String[] args) {
//        Horse h1=new Horse();
//        h1.walk();
//        System.out.println(h1.color);
//        Chicken c1=new Chicken();
//        c1.walk();
////        c1.eat();
//        System.out.println(c1.color);

//        Animal2 a2=new Animal2
        Mustange m1=new Mustange();




    }
}
