/*
 * Week 11 Quizz - stacktrace.
 */
package exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author emaphis
 */
public class Statistics {
    private List<Integer> numbers;

    public Statistics() {
        this.numbers = new ArrayList<>();
    }

    public void add(int number) {
        numbers.add(number);
    }

    public double average() {
        return numbers.stream().mapToInt(i -> i).average().getAsDouble();
    }
}
