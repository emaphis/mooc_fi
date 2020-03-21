
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> names = new HashMap<>();
        names.put("Matthew", "Matt");
        names.put("Michael", "Mix");
        names.put("Arthur", "Artie");

        System.out.println(names.get("Matthew"));
    }

}
