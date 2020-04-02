
package quizz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class SteamQuizz {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        long howManyNumbers = numbers.stream()
                .filter(i -> i < 4)
                .map(i -> i * 2)
                .filter(i -> i > 10)
                .count();

        System.out.println("Count: " + howManyNumbers);
    }
}
