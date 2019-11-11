public class PlayerTestOne {
    public static void main(String[] args) {

        Player player1 = new Player();
        Dealer dealer = new Dealer();
        dealer.shuffle();

        player1.addCardToHand(dealer.deal());
        player1.addCardToHand(dealer.deal());

        System.out.println("Hand Value: " + player1.getHandValue());
        System.out.println("Hand Size: " + player1.getHandSize());
        System.out.println("Cards in Hand: " + player1);

        System.out.println();
        dealer.addCardToHand(dealer.deal());
        dealer.addCardToHand(dealer.deal());

        System.out.println("Hand Value: " + dealer.getHandValue());
        System.out.println("Hand Size: " + dealer.getHandSize());
        System.out.println("Cards in Hand: " + dealer);
        System.out.println();

        if (player1.getHandValue() > dealer.getHandValue()) {
            System.out.println("Player 1 has bigger hand value!");
        } else if (player1.getHandValue() == dealer.getHandValue()) {
            System.out.println("Tie!");
        } else {
            System.out.println("Dealer has a bigger hand value!");
        }
    }
}
