
import java.util.Comparator;


/**
 *
 * @author emaphis
 */
public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        if (c1.getSuit().ordinal() > c2.getSuit().ordinal()) {
            return 1;
        } else if (c1.getSuit().ordinal() < c2.getSuit().ordinal()) {
            return -1;
        }

        return c1.compareTo(c2);
    }

}
