package RazvanTrandafir.Java3;
import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu o propoziție în limba engleză pentru a fi tradusă în Pig Latin:");
        String englishSentence = scanner.nextLine();

        String pigLatinTranslation = PigLatinTranslator.translate(englishSentence);
        System.out.println("Traducerea în Pig Latin: " + pigLatinTranslation);

        scanner.close();
    }
}
