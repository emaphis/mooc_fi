
package reference;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;


public class Reference {
    private final RatingRegister register;

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

        List<Person> reviewerSortedBySimilarity = reviewersSortedBySimilarity(person);
        
        return getRecommendedFilm(person, reviewerSortedBySimilarity);
    }

    private List<Person> reviewersSortedBySimilarity(Person person) {
        Map<Person, Integer> reviewerSimilarity = reviewersSimilarity(register.getPersonalRatings(person));

        List<Person> similarReviewers = new ArrayList<Person>(reviewerSimilarity.keySet());
        Collections.sort(similarReviewers, new PersonComparator(reviewerSimilarity));

        return similarReviewers;
    }

    private Map<Person, Integer> reviewersSimilarity(Map<Film, Rating> personalRatings) {
        Map<Person, Integer> reviewerSimilarity = new HashMap<Person, Integer>();

        for (Person reviewer : register.reviewers()) {
            int similarity = 0;
 
            for (Film film : personalRatings.keySet()) {
                similarity += personalRatings.get(film).getValue() * register.getRating(reviewer, film).getValue();
            }

            if (similarity > 0) {
                reviewerSimilarity.put(reviewer, similarity);
            }
        }
 
        return reviewerSimilarity;
    }

    private Film getRecommendedFilm(Person person, List<Person> reviewersSortedBySimilarity) {
        
        Map<Film, Rating> viewersSeenFilms = register.getPersonalRatings(person);

        for (Person reviewer : reviewersSortedBySimilarity) {
            if (reviewer == person) {
                continue;
            }

            for (Film film : register.getPersonalRatings(reviewer).keySet()) {
                if (viewersSeenFilms.containsKey(film)) {
                    continue;
                }

                if (register.getPersonalRatings(reviewer).get(film).getValue() > 1) {
                    return film;
                }
            }
        }

        return null;
    }

}
