
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }
        // if years are the same compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        // if years and monts are the same
        if (this.year == compared.year && this.month < compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }
    





}
