package timeeaPop.tema3;

import java.util.Locale;
import java.util.Scanner;

public class Palindrom {
    static Scanner scanner = new Scanner(System.in);
// METODA UNU
//    private static Boolean isPalindrom(String word) {
//        String wordWithoutWhiteSpaces = removeWhiteSpacesFromString(word);
//
//        StringBuilder reversedStringBuilder = new StringBuilder(wordWithoutWhiteSpaces).reverse();
//        String reversedString = reversedStringBuilder.toString();
//        boolean isPalindrom = reversedString.equals(wordWithoutWhiteSpaces);
//        if (isPalindrom) {
//            System.out.println("Cuvantul este palindrom.");
//        } else {
//            System.out.println("Cuvantul nu este palindrom.");
//        }
//        return isPalindrom;
//    }

    private static String removeWhiteSpacesFromString(String word) {
        String stringWithoutSpaces = word.replaceAll("\\s", "");
        return stringWithoutSpaces;
    }
    private static boolean isPalindrome(String word) {
        String wordWithoutWhiteSpaces = removeWhiteSpacesFromString(word).toLowerCase(Locale.ROOT);

        int length = wordWithoutWhiteSpaces.length();
        for (int i = 0; i < length / 2; i++) {
            if (wordWithoutWhiteSpaces.charAt(i) != wordWithoutWhiteSpaces.charAt(length -1 - i)){
                System.out.println("Cuvantul nu este palindrom.");
                return false;
            }
        }
        System.out.println("Cuvantul este palindrom.");
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter your word: ");
        String userInput = scanner.nextLine();
        isPalindrome(userInput);
    }
}
