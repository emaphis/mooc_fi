/*
 * Week 9 Example
 */
package inheritance;

/**
 * this and super
 * @author emaphis
 */
public class Superclass {
    private String objectVariable;

    public Superclass() {
        this("Example");
    }

    public Superclass(String value) {
        this.objectVariable = value;
    }

    @Override
    public String toString() {
        return objectVariable;
    }

}
