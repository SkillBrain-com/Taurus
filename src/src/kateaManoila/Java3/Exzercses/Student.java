package kateaManoila.Java3.Exzercses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

class TestMyStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student ecaterina = new Student("Ecaterina", 30);

        studentList.add(ecaterina);
        studentList.add(new Student("Alex", 20));
        studentList.add(new Student("Ion", 25));
        studentList.add(new Student("Ecaterina", 25));

        System.out.println(studentList);
//        System.out.println( studentList.remove(ecaterina));

        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            if (next.age == 25 && next.name.equals("Ecaterina")){
                iterator.remove();
            }

        }
        System.out.println(studentList);

    }
}
