import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    public static final int NUMFACES = 13;
    public static final int NUMSUITS = 4;
    public static final int NUMCARDS = 52;

    public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

    private int topCardIndex;
    private ArrayList<Card> stackOfCards = new ArrayList<Card>(NUMCARDS);

    public Deck() {
        System.out.println("Creating new deck");
        for (int i = 0; i < NUMFACES; i++) {
            for (int j = 0; j < NUMSUITS; j++) {
                Card c = new BlackJackCards(i+1, SUITS[j]);
                stackOfCards.add(c);
            }
        }
    }
    public void shuffle() {
        topCardIndex = 51;
        // Shuffles everything in array list stackOfCards
        System.out.println("Shuffling now...");
        Collections.shuffle(stackOfCards);
    }
    public int size() {
        return stackOfCards.size();
    }

    public int numCardsLeft() {
        return topCardIndex + 1;
    }

    public Card nextCard() {
        return stackOfCards.get(topCardIndex--);
    }
    public String toString() {
        return stackOfCards + "   topCardIndex = " + topCardIndex;
    }

    public static void main(String[] args) {
    }

}
