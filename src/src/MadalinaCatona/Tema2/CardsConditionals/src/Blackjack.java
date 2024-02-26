package MadalinaCatona.Tema2.CardsConditionals.src;

public class Blackjack {
    //1.Calculate the score of any given card
    // (Scorul oricarei carti date)
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
    //2.Determine if two cards make up a Blackjack
    // (Doua carti formeaza un blackjack?)
    public static boolean isBlackjack(String card1, String card2) {
        return(parseCard(card1) + parseCard(card2)) == 21;
    }
    //    ==returnează adevărat dacă partea stângă este egală cu partea dreaptă
    //3.Implement the decision logic for hand scores larger than 20 points
    // (Logica de decizie pentru scorurile de mana > 20 pct.)
    public static String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack) {
            if (dealerScore !=11 && dealerScore !=10) {
//                 && (si) returnează adevărat atunci când ambele condiții sunt adevărate
//                ! (not) returnează adevărat când o condiție este falsă și invers
                return "W";
            } else {
                return "S";
            }
        }
        return "P";
    }
    //4.Implement the decision logic for hand scores with less than 21 points
    //(Logica de decizie pentru scorurile de mana < 21 pct.)
    public static String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
//            >=returnează adevărat dacă partea stângă este mai mare sau egală cu partea dreaptă
            return "S";
        } else if (handScore <= 11) {
//            <=returnează adevărat dacă partea stângă este mai mică sau egală cu partea dreaptă
            return "H";
        } else if (dealerScore >= 7) {
            return "H";
        }
        else {
            return "S";
        }
    }
    public static String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);
        if (handScore > 20 || (card1.equals("ace") && card2.equals("ace"))) {
//            || (sau) returnează adevărat dacă cel puțin o condiție este adevărată
//             && (si) returnează adevărat atunci când ambele condiții sunt adevărate
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}

