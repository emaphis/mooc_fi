
/**
 *
 * @author emaphis
 */
public class Bird {
    private String name;
    private String latin;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
    }

    public String getName() {
        return name;
    }

    public String getLatin() {
        return latin;
    }

    @Override
    public String toString() {
        return name + "(" + latin + ")";
    }

}
