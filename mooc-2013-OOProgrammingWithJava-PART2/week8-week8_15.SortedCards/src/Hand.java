
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Hand implements Comparable<Hand> {
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand other) {
        return this.getValue() - other.getValue();
    }

    public int getValue() {
        int value = 0;
        for (Card card : hand) {
            value += card.getValue();
        }
        return value;
    }

    public void sortAgainstSuit() {
        hand.sort(new SortAgainstSuitAndValue());
    }
}
