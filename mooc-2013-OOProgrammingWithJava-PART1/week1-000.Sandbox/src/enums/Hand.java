
package enums;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class Hand {
    private final List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void printIt() {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void deleteWorst(int value) {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getValue() < value) {
                iterator.remove();
            }
        }
    }

}
