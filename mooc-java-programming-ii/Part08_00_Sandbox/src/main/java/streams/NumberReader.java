/*
 * Week 10 Example
 */
package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author emaphis
 */
public class NumberReader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        // read inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }

        // count the number of values divisiable by three
        long numbersDivisisbleByThree = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number % 3 == 0)
                .count();

        // calculate the average
        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        // prining out the statistics
        System.out.println("Divisisble by three " + numbersDivisisbleByThree);
        System.out.println("Average number: " + average);
    }
}
