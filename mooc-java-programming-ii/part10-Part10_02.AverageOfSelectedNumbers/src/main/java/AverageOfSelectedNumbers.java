
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> list = new ArrayList<>();
        String input = "";

        while (true) {
            input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            list.add(input);
        }

        System.out.println("Print the average of the negative or the positive numbers? (n/p)");
        input = scanner.nextLine();
        if (input.equals("n")) {
            double average = list.stream()
                    .mapToInt(str -> Integer.valueOf(str))
                    .filter(n -> (n < 0))
                    .average()
                    .getAsDouble();

            System.out.println("average of the negative numbers: " + average);
        } else if (input.equals("p")) {
            double average = list.stream()
                    .mapToInt(str -> Integer.valueOf(str))
                    .filter(n -> (n > 0))
                    .average()
                    .getAsDouble();

            System.out.println("average of the positive numbers: " + average);
        }
    }
}
