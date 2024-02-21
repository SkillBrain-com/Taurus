package kateaManoila.Java3.Exzercses.TemaDeAcasa3;

import java.util.Arrays;

public class Polindrom {
    public static void main(String[] args) {
        //elevele;
        System.out.println(isPalindrome("elevele"));
        String [] stringArray = {"40","9", "400"};
        printStringArray(stringArray);
        Arrays.sort(stringArray);
        System.out.println();
        printStringArray(stringArray);

    }

    static boolean isPalindrome(String original) {
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);

        }
        System.out.println("Reverse word is " + reverse);
        return original.equalsIgnoreCase(reverse);
    }
    static void printStringArray(String[] stringArray){
        for (String word:stringArray){
            System.out.println(word + ",");
        }
    }
}


