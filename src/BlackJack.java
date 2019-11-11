import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {
    private ArrayList<Player> players = new ArrayList<Player>();

    public BlackJack() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many players are there?");
        int playerAmount = scan.nextInt();

        Dealer deal = new Dealer();
        players.add(deal);
        for (int i = 0; i < playerAmount; i++) {
            Player player = new Player();
            players.add(player);
        }
    }

    public void playGame() {
        Dealer dealer = ((Dealer) players.get(0));
        dealer.shuffle();
        dealer.resetHand();
        for (int a = 1; a < players.size(); a++) {
            players.get(a).resetHand();
        }

        for (int i = 0; i < 2; i++) {
            dealer.addCardToHand(dealer.deal());
        }
        for (int j = 1; j < players.size(); j++) {
            players.get(j).addCardToHand(dealer.deal());
            players.get(j).addCardToHand(dealer.deal());
        }

        System.out.println();
        System.out.println("Dealer Hand Value: " + dealer.getHandValue());
        System.out.println("Cards in Hand: " + dealer);
        System.out.println();

        for (int k = 1; k < players.size(); k++) {
            System.out.println();
            System.out.println("Player " + k + " Hand Value: " + players.get(k).getHandValue());
            System.out.println("Cards in Hand: " + players.get(k));
            System.out.println();
        }

        for (int k = 1; k < players.size(); k++) {
            while (players.get(k).getHandValue() <= 21 && dealer.hit(k)) {
                if (players.get(k).getHandValue() > 21) {
                    System.out.println("Player busted!");
                    System.exit(1);
                }
                players.get(k).addCardToHand(dealer.deal());
                System.out.println("Player " + k + " Hand Value: " + players.get(k).getHandValue());
            }
        }

        System.out.println();
        System.out.println("Dealer Hand Value: " + dealer.getHandValue());
        while (dealer.getHandValue() <= 17) {
            if (dealer.getHandValue() == 17 || dealer.getHandValue() > 17) {
                break;
            } else if (dealer.getHandValue() > 21) {
                System.out.println("Dealer busted!");
                System.exit(1);
            } else {
                dealer.addCardToHand(dealer.deal());
                System.out.println("Dealer Hand Value: " + dealer.getHandValue());
            }
        }

        for (int i = 1; i < players.size(); i++) {
            System.out.println();
            if (players.get(i).getHandValue() == 21) {
                System.out.println("Player " + i + " Wins with hand value of " + players.get(i).getHandValue());
                players.get(i).setWinCount(players.get(i).getWinCount() + 1);
            } else if (dealer.getHandValue() == 21) {
                System.out.println("Dealer Wins with hand value of " + dealer.getHandValue());
            } else if ( (players.get(i).getHandValue() > dealer.getHandValue()) && (players.get(i).getHandValue() <= 21)) {
                System.out.println("Player " + i + " Wins with hand value of " + players.get(i).getHandValue());
                players.get(i).setWinCount(players.get(i).getWinCount() + 1);
            } else if ( (players.get(i).getHandValue() < dealer.getHandValue()) && (dealer.getHandValue() <= 21)) {
                System.out.println("Dealer Wins with hand value of " + dealer.getHandValue());
            } else if (players.get(i).getHandValue() > 21) {
                System.out.println("Player " + i + " Busted!");
                System.out.println("Dealer Wins!");

            } else if (dealer.getHandValue() > 21) {
                System.out.println("Dealer Busted!");
                System.out.println("Player " + i + " Wins!");
                players.get(i).setWinCount(players.get(i).getWinCount() + 1);
            } else {
                System.out.println("Tie!");
            }

            System.out.println();
            for (int b = 0; b < players.size(); b++) {
                if (b == 0) {
                    System.out.println("Dealer Wins: " + players.get(b).getWinCount());
                } else {
                    System.out.println("Player " + b + " Wins: " + players.get(b).getWinCount());
                }

            }

        }
    }

    public static void main(String[] args) {
        BlackJack game = new BlackJack();
        String input = "y";
        while (input.equals("y")) {
            game.playGame();
            Scanner scan = new Scanner(System.in);
            System.out.println("Would you like to play again? y/n");
            input = scan.nextLine();
        }

    }
}
