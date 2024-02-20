package CristianSandu.java3.exercises;

import java.util.ArrayList;
import java.util.List;

public class NumbersList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("THREE");

        // list.remove (index) -> returns Object deleted
        // list.remove (Object) -> returns true/false

        if (list.remove("TWO")) {
            list.remove("THREE");
        }

        System.out.println(list);

    }


}
