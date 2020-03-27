
package inheritance;

/**
 *
 * @author emaphis
 */
public class SuperCounter extends Counter {

    @Override
    public int addToNumber(int number) {
        return number + 5;
    }

}
