

/**
 *
 * @author emaphis
 */
public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }

    // use to check if this date object (`this`) is bofore
    // the date object given as the parameter (`compared`)
    public boolean before(SimpleDate compared) {
        // first compare years
        if (year < compared.year) {
            return true;
        }
        if (year > compared.year) {
            return false;
        }

        // years are same, compare month
        if (month < compared.month) {
            return true;
        }
        if (month > compared.month) {
            return false;
        }

        // years and months are same, compare days
        if (day < compared.day){
            return true;
        }

        return false;
    }

    @Override
    public boolean equals(Object compared) {
        // if the variables are locate in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the type of the compared object is not SimpleDate, the object are not equal
        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        // convert the Object type compared object
        // into a SimpleDate type object calle comaparedSimpleDate
        SimpleDate comparedSimpeDate = (SimpleDate) compared;

        // if the values of the object variable are the same, the objects are equal
        if (day == comparedSimpeDate.day &&
            month == comparedSimpeDate.month &&
            year == comparedSimpeDate.year) {
            return true;
        }

        return false;
    }

}
