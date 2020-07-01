
package generics;

/**
 *
 * @author emaphis
 */
public class MovieList implements List<Movie> {

    @Override
    public void add(Movie value) {

    }

    @Override
    public Movie get(int index) {
        return new Movie();
    }

    @Override
    public Movie remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
