package CristianSandu.java3.exercises;

import java.util.List;

public class PigLatin {

    private static final List<String> vowels = List.of("a", "e", "i", "o", "u", "xr", "yt");

    public static void main(String[] args) {
        String word = "aware"; // awareay
        System.out.println(pigLatin("aware"));
        System.out.println(pigLatin("xray"));
        System.out.println(pigLatin("yttria"));
        System.out.println(pigLatin("chair"));
        System.out.println(pigLatin("square"));
        System.out.println(pigLatin("my"));
    }

    public static String pigLatin(String word) {
        for (String vowel: vowels) {
            if (word.toLowerCase().startsWith(vowel)) {
                return word+"ay";
            }
        }
        int size = word.length();
        String pigLatinAnswer = "";
        int i;
        for (i = 0 ; i < size; i++) {
            if (isVowel(word.charAt(i))) {
                pigLatinAnswer = word.substring(i); // air
                break;
            }
        }
        if (i == size) {
            return "";
        } //     air + ch =  airch  + ay = airchay
        pigLatinAnswer = pigLatinAnswer + word.substring(0, i) + "ay";
        return pigLatinAnswer;
    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c=='o' || c=='u' || c=='y') {
            return true;
        }
        return false;
    }
}