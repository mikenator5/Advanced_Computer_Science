public class BlackJackCards extends Card{
    private int num;

    public BlackJackCards(int num, String s) {
        super(num, s);
    }

    public int getValue() {
        int temp = super.getValue();
        if (temp > 10) {
            temp = 10;
        }
        if (temp == 1) {
            temp = 11;
        }
        return temp;
    }

    public static void main(String[] args) {
    }
}
