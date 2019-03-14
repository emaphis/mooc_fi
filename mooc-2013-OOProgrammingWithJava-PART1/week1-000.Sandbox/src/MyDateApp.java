
public class MyDateApp {
    public static void main(String[] args) {
        MyDate p1 = new MyDate(14, 2, 2011);
        MyDate p2 = new MyDate(21, 2, 2011);
        MyDate p3 = new MyDate(1, 3, 2011);
        MyDate p4 = new MyDate(31, 12, 2010);

        System.out.println( p1 + " earlier than " + p2 + ": " + p1.earlier(p2));
        System.out.println( p2 + " earlier than " + p1 + ": " + p2.earlier(p1));

        System.out.println( p2 + " earlier than " + p3 + ": " + p2.earlier(p3));
        System.out.println( p3 + " earlier than " + p2 + ": " + p3.earlier(p2));

        System.out.println( p4 + " earlier than " + p1 + ": " + p4.earlier(p1));
        System.out.println( p1 + " earlier than " + p4 + ": " + p1.earlier(p4));
    }
}
