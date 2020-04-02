
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method hereList<Integer> numbers = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(-8);
        numbers.add(-11);
        numbers.add(-3);
        numbers.add(1);
        numbers.add(8);
        numbers.add(1);
        //System.out.println(numbers);
        System.out.println(positive(numbers));
    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toList());
    }
}
