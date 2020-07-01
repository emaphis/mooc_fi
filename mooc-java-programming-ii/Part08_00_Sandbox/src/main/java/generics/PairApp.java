package generics;


/**
 * Test Pair
 * @author emaphis
 */
public class PairApp {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        Pair<Integer, String> pair = new Pair<>();
        pair.setValues(10, "Ten");
        System.out.println(pair.getFirst() + " : " + pair.getSecond());
    }
}
