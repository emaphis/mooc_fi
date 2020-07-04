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
        Pair<Integer, String> pair = new Pair<>(0, "Ten");
        System.out.println(pair.getKey() + " : " + pair.getValue());
    }
}
