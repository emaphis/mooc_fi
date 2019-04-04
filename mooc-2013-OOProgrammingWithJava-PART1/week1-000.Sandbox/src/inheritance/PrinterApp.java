
package inheritance;


public class PrinterApp {

    static void testManyTimes() {
        Object obj = new Object();
        Printer printer = new Printer();
        printer.printManyTimes(obj, 10);
    }

    static void testPrintCharacters() {
        Printer printer = new Printer();
        String string = "works";
        printer.printCharacters(string);
    }


    public static void main(String[] args) {
        //testManyTimes();
        testPrintCharacters();
    }
}
