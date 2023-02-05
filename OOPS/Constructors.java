package OOPS;

public class Constructors {
    public static void main(String[] args) {

        Student s1=new Student();
        s1.name="bhavik";
        s1.roll=456;
        s1.password="1235456";
        s1.marks[0]=100;
        s1.marks[1]=200;
        s1.marks[2]=300;

        Student s2=new Student(s1);
        s2.password="bhavik";
        s1.marks[0]=900;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int[] marks=new int[3];

    //shalow constructor
//    Student(Student s1){
//        marks=new int[3];
//        this.name=s1.name;
//        this.roll=s1.roll;
//        this.marks=s1.marks;
//    }
    //deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i]=s1.marks[i];
        }
    }

    Student(){
        System.out.println("constructor is called....");
    }
    Student(String name){
        marks=new int[3];
        this.name=name;
    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;
    }
}

