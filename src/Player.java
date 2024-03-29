import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int winCount;
    private static int playerCount = 1;

    public Player () {
        System.out.println("Welcome Player " + playerCount + "!");
        playerCount++;
    }

    public Player (int score) {
        setWinCount(score);
        System.out.println("Player " + playerCount + " has won " + winCount + " times!");
        playerCount++;
    }

    public void addCardToHand( Card temp ) {
        System.out.println(temp + " : added to hand.");
        hand.add(temp);
    }

    public void resetHand( ) {
        hand.clear();
        System.out.println("Cleared");
    }

    public void setWinCount( int numWins ) {
        winCount = numWins;
    }

    public int getWinCount() {
        return winCount;
    }

    public int getHandSize() {
        return hand.size();
    }

    public int getHandValue() {
        int count = 0;
        for (int i = 0; i < hand.size(); i++) {
            count += (hand.get(i)).getValue();
        }
        return count;
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

    public String toString() {
        return hand + "";
    }
}
