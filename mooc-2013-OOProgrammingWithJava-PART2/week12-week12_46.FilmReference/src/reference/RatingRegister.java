
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;


public class RatingRegister {
    private final Map<Film, List<Rating>> ratings;
    private final Map<Person, Map<Film, Rating>> personalRatings;

    public RatingRegister() {
        this.ratings = new HashMap<Film, List<Rating>>();
        this.personalRatings = new HashMap<Person, Map<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!ratings.containsKey(film)) {
            List<Rating> ratingsList = new ArrayList<Rating>();
            ratings.put(film, ratingsList);
        }

        ratings.get(film).add(rating);
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!personalRatings.containsKey(person)) {
            Map<Film, Rating> filmRating = new HashMap<Film, Rating>();
            personalRatings.put(person, filmRating);
        }
        if (!personalRatings.get(person).containsKey(film)) {
            personalRatings.get(person).put(film, rating);
        }
        addRating(film, rating);
    }

    public List<Rating> getRatings(Film film) {
        return ratings.get(film);
    }

    public Map<Film, List<Rating>> filmRatings()  {
        return ratings;
    }

    public Rating getRating(Person person, Film film) {
        if (personalRatings.get(person).containsKey(film))
            return personalRatings.get(person).get(film);
        else
            return Rating.NOT_WATCHED;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (!personalRatings.containsKey(person)) {
            return new HashMap<Film,Rating>();
        }
        return personalRatings.get(person);
    }

    public List<Person> reviewers() {
        return new ArrayList<Person>(personalRatings.keySet());
    }

}
