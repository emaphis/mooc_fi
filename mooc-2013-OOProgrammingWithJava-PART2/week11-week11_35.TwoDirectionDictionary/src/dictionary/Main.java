package dictionary;

public class Main {

    static void testForgetfulDictonary() {
        MindfulDictionary dict = new MindfulDictionary();
        dict.add("apina", "monkey");
        dict.add("banaani", "banana");
        dict.add("apina", "apfe");

        System.out.println( dict.translate("apina") );
        System.out.println( dict.translate("monkey") );
        System.out.println( dict.translate("programming") );
        System.out.println( dict.translate("banana") );
    }

    static void testRemove() {
        MindfulDictionary dict = new MindfulDictionary();
        dict.add("apina", "monkey");
        dict.add("banaani", "banana");
        dict.add("ohjelmointi", "programming");
        dict.remove("apina");
        dict.remove("banana");

        System.out.println( dict.translate("apina") );
        System.out.println( dict.translate("monkey") );
        System.out.println( dict.translate("banana") );
        System.out.println( dict.translate("banaani") );
        System.out.println( dict.translate("ohjelmointi") );
    }

    static void testLoad() {
        MindfulDictionary dict = new MindfulDictionary("src/words.txt");
        dict.load();

        System.out.println( dict.translate("apina") );
        System.out.println( dict.translate("ohjelmointi") );
        System.out.println( dict.translate("alla oleva") );
    }

    static void testSave() {
        MindfulDictionary s = new MindfulDictionary("test/tmp/tmp51351.txt");
        s.add("tietokone", "computer");
        s.save();
    }

    public static void main(String[] args) {
        // Test your dictionary here
        //testForgetfulDictonary();
        //testRemove();
        //testLoad();
        testSave();
    }
}
