
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        // test your code here
        //part0();
        //part1();
        //part2();
        //part3();
        //part4();
        part5();
    }

    static void part0() {
        Card first = new Card(2, Suit.DIAMOND);
        Card second = new Card(14, Suit.SPADE);
        Card third = new Card(12, Suit.HEART);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }

    private static void part1() {
        Card first = new Card(4, Suit.HEART);
        Card second = new Card(5, Suit.HEART);
        System.out.println(first.compareTo(second));
    }

    private static void part2() {
        Hand hand = new Hand();

        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.print();
    }

    private static void part3() {
        Hand hand = new Hand();

        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.sort();

        hand.print();
    }

    private static void part4() {
        Hand hand1 = new Hand();

        hand1.add(new Card(2, Suit.DIAMOND));
        hand1.add(new Card(14, Suit.SPADE));
        hand1.add(new Card(12, Suit.HEART));
        hand1.add(new Card(2, Suit.SPADE));

        Hand hand2 = new Hand();

        hand2.add(new Card(11, Suit.DIAMOND));
        hand2.add(new Card(11, Suit.SPADE));
        hand2.add(new Card(11, Suit.HEART));

        int comparison = hand1.compareTo(hand2);

        if (comparison < 0) {
            System.out.println("better hand is");
            hand2.print();
        } else if (comparison > 0) {
            System.out.println("better hand is");
            hand1.print();
        } else {
            System.out.println("hands are equal");
        }
    }

    private static void part5() {
        ArrayList<Card> cards = new ArrayList<>();

        cards.add(new Card(3, Suit.SPADE));
        cards.add(new Card(2, Suit.DIAMOND));
        cards.add(new Card(14, Suit.SPADE));
        cards.add(new Card(12, Suit.HEART));
        cards.add(new Card(2, Suit.SPADE));

        SortBySuit sortBySuitSorter = new SortBySuit();
        Collections.sort(cards, sortBySuitSorter);

        cards.stream().forEach(c -> System.out.println(c));
    }
}
