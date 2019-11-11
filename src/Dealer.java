import java.util.ArrayList;
import java.util.Scanner;

public class Dealer extends Player {
    private ArrayList<Card> dealer = new ArrayList<Card>();
    private Deck deck = new Deck();

    public Dealer() {
    }

    public void shuffle() {
        deck.shuffle();
        System.out.println();
    }

    public Card deal(){
        return deck.nextCard();
    }

    public int numCardsLeftInDeck() {
        return deck.numCardsLeft();
    }

    public boolean hit(int player) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player " + player + " do you want to hit? y/n ");
        String input = scan.next();
        if (input.equals("y")) {
            return true;
        }
        return false;
    }

}
