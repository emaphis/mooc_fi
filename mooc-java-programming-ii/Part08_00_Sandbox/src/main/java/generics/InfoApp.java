
package generics;

/**
 *
 * @author emaphis
 */
public class InfoApp {
    public static void main(String[] args) {
        Info<String, Integer> i1 = new Info<>("Pow", 3);
        Info<Object, Object> i2 = new Info<>("Hey", i1);
        System.out.println(i1);
        System.out.println(i2);
    }
}
