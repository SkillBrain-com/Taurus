package MadalinaCatona.Tema2.AnalynsInfiltration.src;

public class AnnalynsInfiltration {
    // Atac rapid
    public static boolean canFastAttack(boolean knightIsAwake) {return !knightIsAwake; }
    // ! (not) returnează adevărat când o condiție este falsă și invers
    // Poate fi spionat
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake)
    { return knightIsAwake || archerIsAwake || prisonerIsAwake; }
    // || (sau) returnează adevărat dacă cel puțin o condiție este adevărată
    // Poate fi semnalizat
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake)
    { return !archerIsAwake && prisonerIsAwake; }
    // && (si) returnează adevărat atunci când ambele condiții sunt adevărate
    //Poate fi eliberat
    public static boolean canFreedPrisoner(boolean knightIsAwake, boolean archerIsAwek,
                                           boolean prisonerIsAwake, boolean petDogIsPresent)
    { return (prisonerIsAwake && !knightIsAwake && !archerIsAwek) || (!archerIsAwek && petDogIsPresent); }
}
// &&(si) returnează adevărat atunci când ambele condiții sunt adevărate
// ! (not) returnează adevărat când o condiție este falsă și invers
// || (sau) returnează adevărat dacă cel puțin o condiție este adevărată