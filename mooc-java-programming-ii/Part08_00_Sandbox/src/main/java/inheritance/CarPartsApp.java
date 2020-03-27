/*
 * Week 9 Example
 */
package inheritance;

/**
 *
 * @author emaphis
 */
public class CarPartsApp {
    public static void main(String[] args) {
        example1();
    }

    static void example1() {
        Engine engine = new Engine("combustion", "hz", "volkswagen", "VW GOLF 86-9`");
        System.out.println(engine.getEngineType());
        System.out.println(engine.getManufacturer());
    }
}
