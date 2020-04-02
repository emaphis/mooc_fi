/*
 * Week 10 Examples
 */
package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Terminal operations
 * count, forEach, collect, reduce
 * @author emaphis
 */
public class TerminalOperatios {
    public static void main(String[] args) {
        countExample();
        System.out.println("ooooo");
        forEachExample();
        System.out.println("ooooo");
        collectExample();
        System.out.println("ooooo");
        reduceExample();
        System.out.println("ooooo");
        reduceExample2();
    }

    private static void countExample() {
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(17);
        values.add(6);
        values.add(8);

        System.out.println("Values: " + values.stream().count());
    }

    private static void forEachExample() {
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(17);
        values.add(6);
        values.add(8);

        values.stream()
                .filter(value -> value % 2 == 0)
                .forEach(value -> System.out.println(value));
    }

    private static void collectExample() {
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(-17);
        values.add(-6);
        values.add(8);

        ArrayList<Integer> positieset = values.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toCollection(ArrayList::new));

        positieset.stream()
                .forEach(value -> System.out.println(value));
    }

    private static void reduceExample() {
        List<Integer> values = new ArrayList<>();
        values.add(7);
        values.add(3);
        values.add(2);
        values.add(1);

        int sum = values.stream()
                .reduce(0, (previousSum, value) -> previousSum + value);
        System.out.println(sum);
    }

    private static void reduceExample2() {
        ArrayList<String> words = new ArrayList<>();
        words.add("First");
        words.add("Second");
        words.add("Thrid");
        words.add("Fourth");

        String comined = words.stream()
                .reduce("", (previousString, word) -> previousString + word + "\n");

        System.out.println(comined);
    }

    
}
