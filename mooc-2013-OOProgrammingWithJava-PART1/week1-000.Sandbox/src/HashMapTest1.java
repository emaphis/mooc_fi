
import java.util.HashMap;


public class HashMapTest1 {

    static void testMap1() {
        HashMap<String, String> numbers = new HashMap<String, String>();
        numbers.put("One", "Yksi");
        numbers.put("Two", "Kaksi");
        numbers.put("One", "Uno");

        String translation = numbers.get("One");
        System.out.println(translation);

        System.out.println(numbers.get("Two"));
        System.out.println(numbers.get("Three"));
        System.out.println(numbers.get("Yksi"));
    }

    public static void main(String[] args) {
        testMap1();
    }
}
