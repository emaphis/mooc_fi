
package reference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import javafx.print.Collation;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;


public class Reference {
    private RatingRegister register;
    //private Map<Film, List<

    public Reference(RatingRegister register) {
        this.register = register;
    }

    public Film recommendFilm(Person person) {
        Map<Film, Rating> personalRatings = register.getPersonalRatings(person);
        if (personalRatings.isEmpty()) {
            List<Film> filmList = new ArrayList<Film>(register.filmRatings().keySet());
            Map<Film,List<Rating>> flimRatings = register.filmRatings();
            Collections.sort(filmList, new FilmComparator(flimRatings));
            return filmList.get(0);  // first is highest rated
        }
        return new Film("Whatever");
    }

}
