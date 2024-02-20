package CristianSandu.java3.exercises.polymorpihsm;

public class Student {
    String name;
    int age;
    Student() {
        this("James", 25);
//        super();
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class TestMyStudent {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age); // null:0
    }

}