
package enums;

/**
 * the constructor parameters are defined as constant values when they
 * are read
 * @author emaphis
 */
public enum Colour {
    RED("red"),
    GREEN("green"),
    BLUE("blue")
    ;

    private final String name;   // object variable

    private Colour(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
