package equals;

/**
 *
 * @author emaphis
 */
public class NotepadApp {
    public static void main(String[] args) {
        example1();
    }

    static void example1() {
        Notepad basics = new Notepad("Equals basics", 2000);
        Notepad advanced = new Notepad("Equals advanced", 2001);

        System.out.println(basics.equals(basics));
        System.out.println(basics.equals(advanced));
        System.out.println(basics.equals(new Notepad("Equals basics", 2000)));
        System.out.println(basics.equals(new Notepad("Equals basics", 2001)));
    }
}
