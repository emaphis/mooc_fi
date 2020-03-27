/*
 * Week 9 Example
 */
package inheritance;

/**
 * this and super
 * @author emaphis
 */
public class Subclass extends Superclass {

    public Subclass() {
        super("Subclass");
    }

    // Calling a superclass method.
    @Override
    public String toString() {
        return super.toString() + " And let's add my own message to it!";
    }

}
