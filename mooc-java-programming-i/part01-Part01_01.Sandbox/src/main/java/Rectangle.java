

/**
 * Example from week 5
 * @author emaphis
 */
public class Rectangle {
    // instance variables
    private int width;
    private int height;

    // constuctor

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // methods
    public void widen() {
        width = width + 1;
    }

    public void narrow() {
        if (width > 0) {
            width = width - 1;
        }
    }

    public int surfaceArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "(" + width + ", " + height + ")";
    }

}
