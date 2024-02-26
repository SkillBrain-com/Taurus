package MadalinaCatona.Tema3.PigLatin.src;

class Main {


    public static String convertToPigLatin(String word) {
        char firstLetter = word.charAt(0);
        String lowerCaseWord = word.toLowerCase();

        if (isVowel(firstLetter)) {
            return lowerCaseWord + "ay";
        } else {
            int vowelIndex = findFirstVowelIndex(lowerCaseWord);
            String pigLatin = lowerCaseWord.substring(vowelIndex) + lowerCaseWord.substring(0, vowelIndex) + "ay";
            return pigLatin;
        }
    }

    private static boolean isVowel(char letter) {
        return "aeiou".indexOf(Character.toLowerCase(letter)) != -1;
    }

    private static int findFirstVowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        PigLatin x = new PigLatin();
        x.Test();

        String word = "grandmother";
        String pigLatinWord = convertToPigLatin(word);
        System.out.println("Pig Latin for " + word + " is: " + pigLatinWord);
    }
}
