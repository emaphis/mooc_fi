package generics;

/**
 *
 * @author emaphis
 */
public class ListApp {

    public static void main(String[] args) {
        System.out.println("Hello there");
        test1();
        System.out.println("*******");
        test2();
        System.out.println("********");
        test3();
        System.out.println("********");
        test4();
        System.out.println("********");
        test5();
        System.out.println("********");
        test6();
    }

    private static void test1() {
        List<String> myList = new List<>();
        myList.add("hello");
        myList.add("world");

        System.out.println(myList);
    }

    private static void test2() {
        List<String> myList = new List<>();
        for (int i = 0; i < 11; i++) {
            myList.add("hello");
        }
    }

    private static void test3() {
        List<String> myList = new List<>();
        System.out.println(myList.contains("hello"));
        myList.add("hello");
        System.out.println(myList.contains("hello"));
    }

    private static void test4() {
        List<String> myList = new List<>();
        System.out.println(myList.contains("hello"));
        myList.add("hello");
        System.out.println(myList.contains("hello"));
        myList.remove("hello");
        System.out.println(myList.contains("hello"));
    }

    private static void test5() {
        List<String> myList = new List<>();
        System.out.println(myList.contains("hello"));
        myList.add("hello");
        System.out.println(myList.contains("hello"));
        int index = myList.indexOfValue("hello");
        System.out.println(index);
        System.out.println(myList.value(index));
        myList.remove("hello");
        System.out.println(myList.contains("hello"));
    }

    private static void test6() {
        List<String> myList = new List<>();
        myList.add("hello");
        myList.add("world");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.value(i));
        }
    }
}
