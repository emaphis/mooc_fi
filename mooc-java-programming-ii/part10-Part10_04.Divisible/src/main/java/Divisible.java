
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : numbers.stream().filter(val -> val % 2 == 0).collect(Collectors.toList())) {
            list.add(i);
        }

        for(int i : numbers.stream().filter(val -> val % 3 == 0).collect(Collectors.toList())) {
            list.add(i);
        }

        for(int i : numbers.stream().filter(val -> val % 5 == 0).collect(Collectors.toList())) {
            list.add(i);
        }

        return list;
    }

}
