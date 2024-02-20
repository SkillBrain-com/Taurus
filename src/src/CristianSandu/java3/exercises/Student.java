package CristianSandu.java3.exercises;

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

class TestStudent {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student cristian = new Student("Cristian", 30);
        studentList.add(cristian);
        studentList.add( new Student("Alex", 25) );
        studentList.add( new Student("Dragos", 18) );
        studentList.add( new Student("Cristian", 25) );


        System.out.println(studentList);
//        System.out.println(studentList.remove(cristian));

        Iterator<Student> iterator = studentList.iterator();

        while (iterator.hasNext()) {
            Student next = iterator.next();
            if (next.age == 25 && next.name.equals("Cristian")) {
                iterator.remove();
            }
        }
        System.out.println(studentList);



    }

}
