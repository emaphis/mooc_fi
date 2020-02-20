
import java.time.LocalDate;

/**
 * Part 5 example
 *
 * @author emaphis
 */
public class DateTestApp {

    static void testPerson() {
        SimpleDate date = new SimpleDate(1, 1, 780);
        Person3 muhammad = new Person3("Muhammad ibn Musa al-Khwarismi", date);
        Person3 pascal = new Person3("Blaise Pascl", 19, 6, 1623);

        System.out.println(muhammad);
        System.out.println(pascal);
    }

    static void testDate() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();

        System.out.println("today is " + day + "." + month + "." + year);
    }

    static void testOlderThan() {
        SimpleDate date = new SimpleDate(1, 1, 780);
        Person3 muhammad = new Person3("Muhammad ibn Musa al-Khwarismi", date);
        Person3 pascal = new Person3("Blaise Pascl", 19, 6, 1623);

        if (muhammad.olderThan(pascal)) {
            System.out.println(muhammad.getName() + "is older than " + pascal.getName());
        } else {
            System.out.println(muhammad.getName() + " is not older than " + pascal.getName());
        }
    }

    static void testDatecompare() {

        SimpleDate d1 = new SimpleDate(14, 2, 2011);
        SimpleDate d2 = new SimpleDate(21, 2, 2011);
        SimpleDate d3 = new SimpleDate(1, 3, 2011);
        SimpleDate d4 = new SimpleDate(31, 12, 2010);

        System.out.println(d1 + " is earlier than " + d2 + ": " + d1.before(d2));
        System.out.println(d2 + " is earlier than " + d1 + ": " + d2.before(d1));

        System.out.println(d2 + " is earlier than " + d3 + ": " + d2.before(d3));
        System.out.println(d3 + " is earlier than " + d2 + ": " + d3.before(d2));

        System.out.println(d4 + " is earlier than " + d1 + ": " + d4.before(d1));
        System.out.println(d1 + " is earlier than " + d4 + ": " + d1.before(d4));
    }

    public static void main(String[] args) {
        //testPerson();
        //testDate();
        //testOlderThan();
        testDatecompare();
    }
}
