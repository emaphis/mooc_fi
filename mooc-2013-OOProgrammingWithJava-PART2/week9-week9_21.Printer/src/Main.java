
import java.io.FileNotFoundException;


public class Main {
    static void testPrinter() {
        Printer printer = new Printer("src/textfile.txt.");
        try {
            printer.printLinesWhichContain("stuff");
        } catch (FileNotFoundException ex) {
            System.out.println("error: " + ex);
        }
    }

    static void testPrinter2() {
        try {
            Printer printer = new Printer("src/textfile.txt");

            printer.printLinesWhichContain("Väinämöinen");
            System.out.println("-----");
            printer.printLinesWhichContain("Frank Zappa");
            System.out.println("-----");
            printer.printLinesWhichContain("");
            System.out.println("-----");
        } catch (FileNotFoundException ex) {
            System.out.println("error: " + ex);
        }
    }


    public static void main(String[] args) throws Exception {
        // write some test code here
        // for testing purposes, project has files
        //    src/textfile.txt
        //    src/kalevala.txt
        //testPrinter();
        testPrinter2();
    }
}
