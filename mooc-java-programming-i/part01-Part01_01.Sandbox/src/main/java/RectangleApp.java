
/**
 *  Week 5 example
 * @author emaphis
 */
public class RectangleApp {
    public static void main(String[] args) {
        Rectangle first = new Rectangle(40, 80);
        Rectangle rectangle = new Rectangle(10, 10);
        System.out.println(first);
        System.out.println(rectangle);

        first.narrow();
        System.out.println(first);
        System.out.println(first.surfaceArea());
    }
}
