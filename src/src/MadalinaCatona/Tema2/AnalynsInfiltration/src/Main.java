package MadalinaCatona.Tema2.AnalynsInfiltration.src;

import java.lang.reflect.AnnotatedArrayType;

public class Main {
    public static void main(String[] args) {
        AnnalynsInfiltration annalynsInfiltration = new AnnalynsInfiltration();
        boolean knightIsAwake = false;
        System.out.println(AnnalynsInfiltration.canFastAttack(knightIsAwake));
        //Print true
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        System.out.println(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
        //Print true
        boolean petDogIsPresent = false;
        System.out.println(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
        //Print false
        System.out.println(AnnalynsInfiltration.canFreedPrisoner(knightIsAwake,archerIsAwake,
                prisonerIsAwake,petDogIsPresent));
        //Print false
    }
}