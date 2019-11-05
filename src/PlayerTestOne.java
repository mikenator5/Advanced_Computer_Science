public class PlayerTestOne {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println();

        Player player1 = new Player();
        player1.addCardToHand(deck.nextCard());
        player1.addCardToHand(deck.nextCard());
        System.out.println(player1.getHandValue());

        Player player2 = new Player(2);
    }
}
