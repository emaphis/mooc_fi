
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

/**
 *
 * @author emaphis
 */
public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card)  {
        cards.add(card);
    }

    public void print() {
        Iterator<Card> iter = cards.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public void sort() {
        Collections.sort(cards);
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand other) {
        return this.value() - other.value();
    }

    public int value() {
        return cards.stream()
                .map(card -> card.getValue())
                .reduce(0, (x, y) -> x + y);
    }

}
