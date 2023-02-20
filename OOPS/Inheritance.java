package OOPS;



public class Inheritance {
    public static void main(String[] args) {
//    Dog d1=new Dog();
//    d1.eat();
//    d1.legs=4;
//        System.out.println(d1.legs);
        Mamals m1=new Mamals();
        m1.walk();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breathes");
    }
}
//dervied class

class Mamals extends Animal{
    void walk()
    {
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

