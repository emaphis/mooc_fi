
/**
 * Part 5 example
 *
 * @author emaphis
 */
public class Bird {

    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(compared instanceof Bird)) {
            return false;
        }

        // convert the object to a Bird object
        Bird comparedBird = (Bird) compared;

        // if the values of the object variables are equal, the objects are, too
        return this.name.equals(comparedBird.name);

        /*
        // the comparison of names above is equal to
        // the following code

        if (this.name.equals(comparedBird.name)) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
         */
    }

}
