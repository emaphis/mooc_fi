
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(27, 2, 2020);
        System.out.println(date);
        date.advance();
        date.advance();
        date.advance();
        date.advance();
        System.out.println(date);
        date.advance(15);
        System.out.println(date);
        date.advance(15);
        System.out.println(date);

        SimpleDate newDate = date.afterNumberOfDays(30);
        System.out.println(newDate);
    }
}
