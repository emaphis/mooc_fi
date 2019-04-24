
package reference;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import javafx.print.Collation;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;


public class Reference {
    private RatingRegister register;

    public Reference(RatingRegister register) {
        this.register = register;
    }

    public Film recommendFilm(Person person) {
        Map<Film, Rating> filmRatings = register.getPersonalRatings(person);
        List<Rating> ratings = filmRatings.values();
        Collections.sort(ratings);
    }

}
