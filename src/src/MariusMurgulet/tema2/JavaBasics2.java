package MariusMurgulet.tema2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBasics2 {
    public static void main(String[] args) {
        char [] letter = {'d', 'c', 'b', 'i', 'a'}; //anonymouse array
        System.out.println(letter);
        int [] intArray = new int[5];
        intArray [0] = 1;
        intArray [1] = 5;
        intArray [2] = 15;
        intArray [3] = 20;
        intArray [4] = 25;
        //System.out.println(intArray);
        // PENTRU A LISTA RAPID UN ARRAY !!!!!!
        System.out.println(Arrays.toString(intArray));
//hard coded
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
//            System.out.println(intArray[0]);
//            System.out.println(intArray[1]);
//            System.out.println(intArray[2]);
        }
        char [] [] arr = {
                {'A','B'},
                {'D','E','F'},
                {'G','H','I','J'},
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(arr[i].length);
            System.out.println();
        }
//        String args1[], args2 [], args3 [];
//        args1 = new  String[2];
//        args1[0] = "A";
//        args1[1] = "B";
//        args3 = args2 = args1
        ArrayList <String> list = new ArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("!");
        list.add("Here!");
        list.remove(3);
        list.remove("Here!");

        if("Hello".equalsIgnoreCase("hello")){
            System.out.println(true);
        }
        if(list.contains("Hello")){
            System.out.println("List contains Hello");
        } else {
            System.out.println("List doesn't contain Hello");
        }

        //System.out.println(list);
        List<String> semaphoreLight = new ArrayList<>(3);
        semaphoreLight.add(0, "Rosu");
        semaphoreLight.add(1, "Galben");
        semaphoreLight.add(2, "Verde");
        semaphoreLight.set(1, "Portocaliu");

       // System.out.println(semaphoreLight);
        int start = 0;
//
//        while (start < semaphoreLight.size()){
////            System.out.println(semaphoreLight.get(start));
////            start++;
//            if(semaphoreLight.get(start).contains("Portocaliu")){
//                System.out.println("Contine Portocaliu");
//                break;
//            }
//            System.out.println("still in the loop");
//            start++;
//            System.out.println("iteration=" + start);
//        }

//        do {
//            System.out.println(semaphoreLight.get(start));
//            start++;
//        } while (false);

//        outer_label:
//        while (true){
//            int z=0;
//            inner_label:
//            while (true){
//                if(z>=10){
//                    break outer_label;
//                } else {
//                    System.out.println(z++);// 0 1 2 3 4 5 6 7 8 9 10
//                }
//            }
//        }
//    byte var = 100;
//        switch (var){
//            case 120:
//                System.out.println("var is 120");
//                break;
//            case 100:
//                System.out.println("var is 100");
//                break;
//            default:
//                System.out.println("Not 100 or 120");
//        }

        // AND (si) - &&
        if(false && true && false && true){
            System.out.println("all is true");
        } else {
            System.out.println("all is not true");
        }

        // OR (ORI) - ||
        if (true || false || true){
            System.out.println("At list one is true");
        } else {
            System.out.println("None is true");
        }
        System.out.println(!!!!true); // false true false true
    }
}
