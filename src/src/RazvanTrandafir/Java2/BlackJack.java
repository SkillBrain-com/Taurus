package RazvanTrandafir.Java2;

public class BlackJack {

    // 1: Calculate the score of any card
    public static int parseCard(String card) {
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

    // 2: Determine if two cards make up a Blackjack
    public static boolean isBlackjack(String card1, String card2) {
        int value1 = parseCard(card1);
        int value2 = parseCard(card2);
        return (value1 + value2 == 21);
    }

    // 3: How to determinate large hand scores
    public static String largeHand(boolean isBlackJack, int dealerScore) {
        if (isBlackJack && (dealerScore < 10 || dealerScore == 11)) {
            return "Win";
        } else if (isBlackJack) {
            return "Stand";
        } else {
            return "Split";
        }
    }

    // 4: How to determinate small hand scores
    public static String smallHand(int handScore, int dealerScore) {
        if (handScore <= 11) {
            return "Hit";
        } else if (handScore >= 17) {
            return "Stand";
        } else if (handScore >= 12 && handScore <= 16) {
            if (dealerScore >= 7) {
                return "Hit";
            } else {
                return "Stand";
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String card1 = "queen";
        String card2 = "ace";
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = 7;
        boolean isBlackJack = isBlackjack(card1, card2);

        if (handScore > 20) {
            System.out.println(largeHand(isBlackJack, dealerScore));
        } else if (handScore < 21) {
            System.out.println(smallHand(handScore, dealerScore));
        }
    }
}

