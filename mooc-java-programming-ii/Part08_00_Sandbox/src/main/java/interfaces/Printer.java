/*
 * Week 9 Example
 */
package interfaces;

/**
 * Interfaces as method parameters
 * @author emaphis
 */
public class Printer {
    // print a readable
    public void print(Readable readable) {
        System.out.println(readable.read());
    }
}
