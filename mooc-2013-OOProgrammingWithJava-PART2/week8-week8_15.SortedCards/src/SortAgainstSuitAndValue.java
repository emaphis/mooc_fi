
import java.util.Comparator;


public class SortAgainstSuitAndValue implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
        int compare = card1.getSuit() - card2.getSuit();

        if (compare == 0) {  // same suite
            compare = card1.getValue() - card2.getValue();
        }

        return compare;
    }

}
