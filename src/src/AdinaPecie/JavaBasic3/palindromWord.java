package AdinaPecie.JavaBasic3;

import java.util.Scanner;

public class palindromWord {

    public static void verificare(){

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("Please enter your word:" );

        boolean ok = true;

          for (int i=0; i< word.length(); i++) {
              if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                  ok = false;
              }
          }
              System.out.println("Word " + word + " is a palindrom is: " + ok);


        }

    public static void main(String[] args) {

        verificare();
    }
    }









