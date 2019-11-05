public class Card {

    public static final String FACES[] = {"ACE", "TWO","THREE","FOUR", "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
    private String suit;
    private int face;

    public Card(int num, String s) {
        suit = s.toUpperCase();
        face = num;
    }
    public String getSuit() {
        return suit;
    }
    public int getValue() {
        return face;
    }
    public String toString() {
        return FACES[face-1] + " of " + getSuit() + " | value = " + getValue();
    }

    public static void main(String[] args) {
    }
}
