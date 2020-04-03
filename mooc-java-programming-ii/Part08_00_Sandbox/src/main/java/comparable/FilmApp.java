/*
 * Week 10 Example
 */
package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class FilmApp {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("A", 2000));
        films.add(new Film("B", 1999));
        films.add(new Film("C", 20001));
        films.add(new Film("D", 2000));

        for (Film film : films) {
            System.out.println(film);
        }

        System.out.println();

        Comparator<Film> comparator = Comparator
                .comparing(Film::getReleaseYear)
                .thenComparing(Film::getName);

        Collections.sort(films, comparator);

        films.forEach((film) -> {
            System.out.println(film);
        });
    }

}
