
/**
 *
 * @author emaphis
 */
public class Literacy {
    private String sex;
    private String country;
    private int year;
    private double percent;

    public Literacy(String sex, String country, int year, double percent) {
        this.sex = sex;
        this.country = country;
        this.year = year;
        this.percent = percent;
    }

    

    public String getNation() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getSex() {
        return sex;
    }

    public double getPercent() {
        return percent;
    }

    @Override
    public String toString() {
        return country + " (" + year + "), " + sex + ", " + percent;
    }

}
