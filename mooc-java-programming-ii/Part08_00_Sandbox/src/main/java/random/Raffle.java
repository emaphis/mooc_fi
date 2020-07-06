
package random;

import java.util.Random;

/**
 *
 * @author emaphis
 */
public class Raffle {
    public static void main(String[] args) {
        Random ladyLuck = new Random();

        for (int i = 0; i < 10; i++) {
            // Draw and print a random number
            int randomNumber = ladyLuck.nextInt(10);
            System.out.println(randomNumber);
        }
    }
}
