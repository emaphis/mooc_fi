package dictionary;

public class Main {

    public static void main(String[] args) {
        // You can test your dictionary here
        //part1();
        //part2();
        //part3();
        part4();
    }

    private static void part1() {
        SaveableDictionary dictionary = new SaveableDictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("apina", "apfe");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("monkey"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("banana"));
    }

    private static void part2() {
        SaveableDictionary dictionary = new SaveableDictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("ohjelmointi", "programming");
        dictionary.delete("apina");
        dictionary.delete("banana");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("monkey"));
        System.out.println(dictionary.translate("banana"));
        System.out.println(dictionary.translate("banaani"));
        System.out.println(dictionary.translate("ohjelmointi"));
    }

    private static void part3() {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
    }

    private static void part4() {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        dictionary.load();
        dictionary.add("computer", "tietokone");

        dictionary.save();
    }
}
