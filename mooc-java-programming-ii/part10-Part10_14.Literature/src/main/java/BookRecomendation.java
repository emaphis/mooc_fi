
/**
 *
 * @author emaphis
 */
public class BookRecomendation {
    private String name;
    private int ageRecomendation;

    public BookRecomendation(String name, int ageRecomendation) {
        this.name = name;
        this.ageRecomendation = ageRecomendation;
    }

    public String getName() {
        return name;
    }

    public int getAgeRecomendation() {
        return ageRecomendation;
    }

    @Override
    public String toString() {
        return name + " (recommended for " + ageRecomendation + " year-olds or older)";
    }

}
