package kateaManoila.Java3.Exzercses.Polymorphism;

public class Student {
    String name;
    int age;
    Student(){
        this("Ion", 24);

    }
    Student(String name ,int age){
        this.name = name;
        this.age = age;
    }
}
class TestMyStudent{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name +":" +s.age);
    }

}
