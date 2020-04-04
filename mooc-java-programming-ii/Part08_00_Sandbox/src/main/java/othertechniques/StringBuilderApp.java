/*
 * Week 10 Examples
 */
package othertechniques;



/**
 * The StringBuilder
 * @author emaphis
 */
public class StringBuilderApp {
    public static void main(String[] args) {
        concatExample();
        stringBuilderExample();
    }

    // Problem: concatenation creates a new String for every call.
    static void concatExample() {
        String numbers = "0";
        for (int i = 1; i < 5; i++) {
            numbers = numbers + i;  // concatenation.
        }
        System.out.println(numbers);
    }

    private static void stringBuilderExample() {
        StringBuilder builder = new StringBuilder("0");
        for (int i = 1; i < 5; i++) {
            builder.append(i);
        }
        System.out.println(builder.toString());
    }
}
