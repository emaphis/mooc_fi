
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;


public class FilmComparator implements Comparator<Film> {
    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }


    private int sum(Film film) {
        int sum = 0;
        for (Rating rating : ratings.get(film)) {
            sum += rating.getValue();
        }
        return sum;
    }

    @Override
    public int compare(Film o1, Film o2) {
        return sum(o2) - sum(o1);
    }

}
