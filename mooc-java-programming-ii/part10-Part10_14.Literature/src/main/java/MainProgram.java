
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BookRecomendation> list = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int ageRecomedation = Integer.valueOf(scanner.nextLine());

            list.add(new BookRecomendation(name, ageRecomedation));

            System.out.println();
        }

        System.out.println("");

        System.out.println(list.size() + " books in total. \n");

        Comparator<BookRecomendation> comparator = Comparator
                .comparing(BookRecomendation::getAgeRecomendation)
                .thenComparing(BookRecomendation::getName);

        Collections.sort(list, comparator);

        list.stream()
                .forEach(recomendation -> System.out.println(recomendation));
    }

}
