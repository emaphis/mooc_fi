
package enums;


public class Main {

    public static void main(String[] args) {
        Card first = new Card(10, Suit.HEARTS);

        System.out.println("First: " + first);

        if (first.getSuit() == Suit.CLUBS) {
            System.out.println("It's a clubs");
        } else {
            System.out.println("It's not clubs");
        }
    }

}
