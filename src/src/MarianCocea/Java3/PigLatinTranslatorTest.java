package MarianCocea.Java3;

import java.util.List;

public class PigLatinTranslatorTest {

    public static void main(String[] args) {
        String word = "aware"; //awareay
    }
    public static void pigLatin(String word){
        List<String> vowel= List.of("a", "e", "i", "o", "u", "xr", "yt");
        for (String vowels: vowel){
            if (word.toLowerCase().startsWith(vowels)){
                System.out.println(word + "ay");
            }
        }

    }
}
