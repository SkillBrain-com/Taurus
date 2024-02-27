package MarianCocea.Java2Bonus;

public class Blackjack {

    // Task 1: Calculate the score of any given card
    public static int receivedCard(String card) {
        switch (card) {
            case "ace":
                return 11;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;
            default:
                return 0;
        }
    }

    // Task 2: Determine if two cards make up a Blackjack
    public static boolean isBlackjack(String card1, String card2) {
        return (receivedCard(card1) + receivedCard(card2)) == 21;
    }

    // Task 3: Implement the decision logic for hand scores larger than 20 points
    public static String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack) {
            if (dealerScore != 11 && dealerScore < 10) {
                return "W";
            } else {
                return "S";
            }
        } else {
            return "P"; // Assuming a pair of aces, should be split
        }
    }

    // Task 4: Implement the decision logic for hand scores with less than 21 points
    public static String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        } else if (handScore <= 11) {
            return "H";
        } else {
            if (dealerScore >= 7) {
                return "H";
            } else {
                return "S";
            }
        }
    }

    public static String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = receivedCard(card1) + receivedCard(card2);
        int dealerScore = receivedCard(dealerCard);

        if (handScore > 20 || (card1.equals("ace") && card2.equals("ace"))) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }

    public static void main(String[] args) {
        // Test the methods
        System.out.println(firstTurn("ace", "ace", "seven"));
        System.out.println(firstTurn("queen", "ace", "seven"));
        System.out.println(firstTurn("king", "nine", "king"));
        System.out.println(firstTurn("five", "six", "ace"));
    }
}

