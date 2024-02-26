package MadalinaCatona.Tema2.CardsConditionals.src;

public class Main {
    public static void main(String[] args) {
        Blackjack blackjack = new Blackjack();
        System.out.println(blackjack.firstTurn("ace", "ace", "seven"));
        //Print P
        System.out.println(blackjack.firstTurn("queen", "ace", "seven"));
        //Print W
        System.out.println(blackjack.firstTurn("eight", "seven", "king"));
        //Print S
        System.out.println(blackjack.firstTurn("five", "six", "king"));
        //Print H
        System.out.println(blackjack.isBlackjack("ace", "ten"));
        //testare isBlackjack
    }
}