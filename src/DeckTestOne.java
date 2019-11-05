public class DeckTestOne {
    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();
        System.out.println(d.size());
        System.out.println(d.nextCard());
        System.out.println(d.numCardsLeft());
        System.out.println(d.numCardsLeft());

        System.out.println();
    }
}
