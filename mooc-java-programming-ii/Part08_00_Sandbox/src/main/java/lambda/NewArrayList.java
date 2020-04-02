/*
 * Week 10 Example
 */
package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author emaphis
 */
public class NewArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(6);

        ArrayList newList = list.stream()
                .filter(value -> value > 3)
                .map(value -> value * 2)
                .collect(Collectors.toCollection(ArrayList::new ));

        System.out.println(newList);
    }
}
