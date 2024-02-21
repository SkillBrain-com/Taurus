package kateaManoila.Java3.Exzercses;

import java.util.ArrayList;
import java.util.List;

public class NumbersList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("FOUR");

        //list.remove(index) - returneaza obectul sters.
        //list.remove(object) - returneaza  true/false

        if (list.remove("TWO")){
            list.remove("ONE");

        }
        System.out.println(list);
    }
}
