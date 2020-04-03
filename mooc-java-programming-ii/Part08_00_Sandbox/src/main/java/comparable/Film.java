/*
 * Week 10 Example
 * Sorting by Multiple Criteria
 */
package comparable;

/**
 * Comparators
 * @author emaphis
 */
public class Film {
    private String name;
    private int releaseYear;

    public Film(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return name + " (" + releaseYear + ")";
    }
}
