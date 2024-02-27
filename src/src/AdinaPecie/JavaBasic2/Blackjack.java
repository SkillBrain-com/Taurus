package AdinaPecie.JavaBasic2;

import java.util.Random;

public class Blackjack {
        public static int handScore = 0;
        public static int dealerScore = 0;

        public static int parseCard(String card)
        {
            switch (card)
            {
                case "ace":
                    return 11;
                case "two":
                    return 2;
                case "three":
                    return 3;
                case "four":
                    return 4;
                case "five" :
                    return 5;
                case "six" :
                    return 6;
                case "seven":
                    return 7;
                case "eight":
                    return 8;
                case "nine":
                    return 9;
                case "teen":
                case "jack":
                case "queen":
                case "king":
                    return 10;
                default:
                    return 0;

            }
        }

        public static String deal() {


            String[] pack = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "ten", "jack", "queen", "king"};

            Random random = new Random();

            //gets a random index between 0 and lenght of pack
            int index = random.nextInt(pack.length);

            //returns a random card from the pack
            return pack[index];
        }
        public boolean isBlackjack(String card1, String card2)
        {
            if(parseCard(card1) + parseCard(card2) == 21)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        public String largeHand(String card1, String card2, String dealerCard)
        {
            if(card1=="ace" && card2=="ace")
                return "Split";
            else
            if(isBlackjack(card1,card2) && parseCard(dealerCard)<=10)
                return "Stand";
            else
                return "Error";
        }

        public String smallHand(int handScore, int dealerScore)
        {
            if(handScore>=17)
            {
                return "Stand";
            }
            else if(handScore<=11)
            {
                return "Hit";
            }
            else if(handScore<=16 && handScore >=12 && dealerScore>=7)
            {
                return "Hit";
            }
            else
            {
                return "Stand";
            }

        }

        public void Stand()
        {

        }

        public void Hit()
        {

        }


        public String firstTurn(String card1, String card2, String dealerCard)
        {
            int handScore = parseCard(card1) + parseCard(card2);
            int dealerScore = parseCard(dealerCard);
            if(20 < handScore) {
                return largeHand(card1, card2, dealerCard);
            }
            else {
                return smallHand(handScore, dealerScore);
            }
        }

    }
