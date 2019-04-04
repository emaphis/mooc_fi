
package inheritance;


public class Printer {

    public void printManyTimes(Object object, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(object.toString());
        }
    }

    public void printCharacters(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            System.out.println(charSequence.charAt(i));
        }
    }

}
