package MariusMurgulet.tema3;

import java.util.Scanner;

public class PigLatinTranslator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu propozitie pentru traducere");
        String sentence = sc.nextLine();
        String [] words = sentence.split(" ");
        StringBuilder pigLatinSentence = new StringBuilder();
        for(String word : words)
        {
            pigLatinSentence.append(translateToPigLatin(word)).append(" ");
        }
        System.out.println("Pig Latin Tradus: " + pigLatinSentence.toString());
    }

    private static String translateToPigLatin(String word) {
        String lowerWord = word.toLowerCase();
        if(lowerWord.startsWith("xr") || lowerWord.startsWith("yt")||
                "aeiou".indexOf(lowerWord.charAt(0)) != -1)
        {
            return word + "ay";
        }
        else
        {
            int index = 0;
            StringBuilder consonantCluster = new StringBuilder();
            while (index < lowerWord.length())
            {
                char ch = lowerWord.charAt(index);
                if("aeiou".indexOf(ch) != -1 )
                {
                    break;
                } else if (ch == 'q' && index<lowerWord.length() -1 &&
                        lowerWord.charAt(index + 1) == 'u') {
                    consonantCluster.append(ch).append('u');
                    index += 2;
                    break;
                }
                else {
                    consonantCluster.append(ch);
                    index++;
                }
            }
            if(word.length() == 2 && word.charAt(1) == 'y')
            {
                return word.charAt(1) + word.charAt(0) + "ay";
            }
            else {
                return word.substring(index) + consonantCluster + "ay";
            }
        }
    }
}
}