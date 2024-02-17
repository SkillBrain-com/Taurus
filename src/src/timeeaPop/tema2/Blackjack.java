package timeeaPop.tema2;

public class Blackjack {
    // 1. score of given card
    static int parseCard(String card){
        switch (card){
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
                return 10;
            case "jack":
                return 10;
            case "queen":
                return 10;
            case "king":
                return 10;
            default:
                return 0;
        }
    }

    // 2. Determine if two cards make up a Blackjack.
    static boolean isBlackJack(String card1, String card2) {
        return (parseCard(card1) + parseCard(card2) == 21); // boolean method si returneaza rezultatul parantezei, daca == 21 ii adv deci return true.
    }

    // 3. Implement the decision logic for hand scores larger than 20 points.
    static String largeHand(boolean isBlackjack, int dealerScore) {
/*
If you have a pair of aces you must always split them.
If you have a Blackjack (two cards that sum up to a value of 21), and the dealer does not have an ace, a figure or a ten then you automatically win.
If the dealer does have any of those cards then you'll have to stand and wait for the reveal of the other card.
 */
        if (isBlackjack == true) {
            if (dealerScore != 11 && dealerScore!= 10){
                return "W";
            } else {
                return "S";
            }
        }

        if (dealerScore > 21){
            return "P";
        }
        return " "; // daca nu se indeplinesc conditiile de la if, return empty String
    }

    //4. Implement the decision logic for hand scores with less than 21 points.
    static String handScore(int handScore, int dealerScore) {
/*
If your cards sum up to 17 or higher you should always stand.
If your cards sum up to 11 or lower you should always hit.
If your cards sum up to a value within the range [12, 16] you should always stand unless the dealer has a 7 or higher, in which case you should always hit.
 */
        if (handScore >= 17){
            return "S";
        } else if (handScore <= 11) {
            return "H";
        } else if (handScore >= 12 && handScore <= 16) {
            if (dealerScore >=7){
                return "H";
            } else {
                return "S";
            }
        }
        return " ";
    }
    public static void main(String[] args) {
        System.out.println(isBlackJack("ace","queen"));
        System.out.println(largeHand(true, 7));
        System.out.println(handScore(15,12));
    }
}
