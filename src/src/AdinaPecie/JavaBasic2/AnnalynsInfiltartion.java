package AdinaPecie.JavaBasic2;

import java.util.Random;

public class AnnalynsInfiltartion {
        static boolean knightSleeping, archerSleeping, prisonerAwake;

        public static void main(String[] args) {
            // Simulate random conditions
            Random random = new Random();
            knightSleeping = random.nextBoolean();
            archerSleeping = random.nextBoolean();
            prisonerAwake = random.nextBoolean();

            System.out.println("Knight Sleeping: " + knightSleeping);
            System.out.println("Archer Sleeping: " + archerSleeping);
            System.out.println("Prisoner Awake: " + prisonerAwake);

            // Execute actions based on conditions
            if (knightSleeping && archerSleeping) {
                fastAttack();
            } else if (!knightSleeping || !archerSleeping) {
                spy();
                if (prisonerAwake && !archerSleeping) {
                    signalPrisoner();
                }
            }

            if (prisonerAwake) {
                if (knightSleeping && !archerSleeping) {
                    if (hasDog()) {
                        freePrisonerWithDog();
                    } else {
                        freePrisonerSneaky();
                    }
                }
            }
        }

        static void fastAttack() {
            System.out.println("Executing fast attack!");
        }

        static void spy() {
            System.out.println("Spying on the camp!");
        }

        static void signalPrisoner() {
            System.out.println("Signaling prisoner using bird sounds!");
        }

        static void freePrisonerWithDog() {
            System.out.println("Freeing prisoner with the help of the dog!");
        }

        static void freePrisonerSneaky() {
            System.out.println("Freeing prisoner sneakily!");
        }

        static boolean hasDog() {
            // Return true if Annalyn has her pet dog, false otherwise
            return true; // Assuming Annalyn always has her dog for simplicity
        }
    }

