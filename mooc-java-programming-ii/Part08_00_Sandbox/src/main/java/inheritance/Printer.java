/*
 * Week 9 Example
 */
package inheritance;

/**
 * Object polymorphism
 * @author emaphis
 */
public class Printer {

    public void printManyTime(Object object, int times) {
        int i = 0;
        while (i < times) {
            System.out.println(object.toString());
            i++;
        }
    }

    public void printCharacters(CharSequence charSequence) {
        int i = 0;
        while (i < charSequence.length()) {
            System.out.println(charSequence.charAt(i));
            i++;
        }
    }
}
