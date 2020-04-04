/*
 * Week 10 Example
 */
package enums;

/**
 * Enums may contain Object references.
 * @author emaphis
 */
public enum Color {
    // constructor parameters
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private String code;   // Object reference

    private Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

