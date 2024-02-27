package RazvanTrandafir.Java3;
public class PigLatinTranslator {
    public static String translate(String englishSentence) {
        String[] words = englishSentence.split("\\s+");
        StringBuilder pigLatinSentence = new StringBuilder();

        for (String word : words) {
            pigLatinSentence.append(translateWord(word)).append(" ");
        }

        return pigLatinSentence.toString().trim();
    }

    private static String translateWord(String word) {
        if (word.matches("[aeiou]|xr|yt")) {
            return word + "ay";
        } else if (word.matches("qu.*")) {
            return word.substring(2) + "quay";
        } else {
            int firstVowelIndex = findFirstVowelIndex(word);
            return word.substring(firstVowelIndex) + word.substring(0, firstVowelIndex) + "ay";
        }
    }

    private static int findFirstVowelIndex(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int smallestIndex = Integer.MAX_VALUE;

        for (char vowel : vowels) {
            int index = word.indexOf(vowel);
            if (index != -1 && index < smallestIndex) {
                smallestIndex = index;
            }
        }

        return smallestIndex == Integer.MAX_VALUE ? -1 : smallestIndex;
    }
}