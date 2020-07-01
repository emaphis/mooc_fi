
package generics;

/**
 *
 * @author emaphis
 */
public class LockerApp {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        Locker<String> str = new Locker<>();
        str.setValue(":)");
        System.out.println(str.getValue());
    }

    private static void test2() {
        Locker<Integer> inloc = new Locker<>();
        inloc.setValue(5);
        System.out.println(inloc.getValue());
    }

}
