package CarmenOltean.Java_3;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String translatedWord = PigLatinTranslator(word);
        System.out.println("The Pig Latin word is: " + translatedWord);
        
    }
    public static String PigLatinTranslator(String word){
        char firstLetter = Character.toLowerCase(word.charAt(0));
        if (firstLetter=='a' || firstLetter=='e' || firstLetter=='i'|| firstLetter=='o' ||firstLetter=='u'||
                word.startsWith("xr") || word.startsWith("yr")) {
            return word+"ay";
        }
        else {
            int index = 0;
            while (index<word.length() && !isVowel(word.charAt(index))){
                if(word.charAt(index) == 'q' && index+1<word.length() && word.charAt(index+1) == 'u'){
                    index+=2;
                } else if (word.charAt(index) == 'y'&& !isVowel(word.charAt(index-1))) {
                    break;
                }
                else {
                    index++;
                }
            }
            return word.substring(index) + word.substring(0,index) + "ay";
        }


    }
    public static boolean isVowel(char l){
        return l=='a' || l=='e' || l=='i' || l=='o' || l=='u';
    }
}
