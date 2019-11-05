public class CardTestOne extends BlackJackCards {
    public CardTestOne(int num, String s) {
        super(num, s);
    }

    public static void main(String[] args) {
        BlackJackCards card = new BlackJackCards(1, "Diamond");
        BlackJackCards card2 = new BlackJackCards(1, "Diamonds");
        BlackJackCards card3 = new BlackJackCards(4, "Clubs");
        BlackJackCards card4 = new BlackJackCards(12, "Spades");
        BlackJackCards card5 = new BlackJackCards(12, "Spades");
        BlackJackCards card6 = new BlackJackCards(9, "Spades");

        System.out.println(card);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card4);
        System.out.println(card5);
        System.out.println(card6);

    }
}
