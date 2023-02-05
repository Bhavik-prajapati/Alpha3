package OOPS;

class Student1{
    String name;
    int roll;
    static String schoolname;
    void getName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
public class Statics {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.schoolname="JAGV";
        Student1 s2=new Student1();
        System.out.println(s2.schoolname);
//        System.out.println(s2.schoolname);

    }
}
