
import java.util.ArrayList;


public class ReadableApp {

    static void testSMS() {
        SMS message = new SMS("ope", "Awesome stuff!");
        System.out.println(message.read());

        ArrayList<SMS> messages = new ArrayList<SMS>();
        messages.add(new SMS("unknown", "I hid the body."));
    }

    static void testSMS2() {
        ArrayList<String> pages = new ArrayList<String>();
        pages.add("Split your method into short clear chunks.");
        pages.add("Devide the user interface logic from the application logic.");
        pages.add("At first, always code only a small program which solves only a part of the problem.");
        pages.add("Practice makes perfect. Make up your own fun project.");

        EBook book = new EBook("Programming Hints.", pages);
        for(int page = 0; page < book.howManyPages(); page++) {
            System.out.println(book.read());
        }
    }

    static void testInterfaceAsVariable() {
        String string = "string-object";
        Readable readable = new SMS("teacher", "Something crazy is going to happend");
 
        ArrayList<String> pages = new ArrayList<String>();
        pages.add("A method can call itself.");

        Readable book = new EBook("Recursion Principles", pages);
        for(int page = 0; page < ((EBook)book).howManyPages(); page++) {
            System.out.println(book.read());
        }
    }

    static void testInterfaceAsVariable2() {
        ArrayList<Readable> numberList = new ArrayList<Readable>();

        numberList.add(new SMS("teacher", "never been programming before..."));
        numberList.add(new SMS("teacher", "gonna love it i think!"));
        numberList.add(new SMS("teacher", "give me something more challenging! :)"));
        numberList.add(new SMS("teacher", "you think i can do it?"));
        numberList.add(new SMS("teacher", "up here we send several messages each day"));

        for (Readable readable: numberList) {
            System.out.println(readable.read());
        }
    }

    static void testPrinter() {
        SMS message = new SMS("teacher", "Wow, this printer is able to print them, actually!");
        ArrayList<String> pages = new ArrayList<String>();
        pages.add("(3, 5) are the numbers in common between (1, 3, 5) and (2, 3, 4, 5).");

        EBook book = new EBook("Introduction to University Mathematic", pages);

        Printer printer = new Printer();
        printer.print(message);
        printer.print(book);
    }

    static void testNumberList() {
        NumberList joelList = new NumberList();
        joelList.add(new SMS("matti", "have you already written the tests?"));
        joelList.add(new SMS("matti", "did you have a look at the submissions?"));

        System.out.println("Joel has " + joelList.howManyReadables() + " messages to read");
    }

    static void testNumberList2() {
        NumberList joelList = new NumberList();
        for (int i = 0; i < 1000; i++) {
            joelList.add(new SMS("matti", "have you already written the tests?"));
        }

        System.out.println("Joel has " + joelList.howManyReadables() + " messages to read");
        System.out.println("Let's delegate some reading to Mikael");

        NumberList mikaelList = new NumberList();
        mikaelList.add(joelList);
        mikaelList.read();

        System.out.println();
        System.out.println("Joel has " + joelList.howManyReadables() + " messages to read");
    }

    public static void main(String[] args) {
        //testSMS();
        //testSMS2();
        //testInterfaceAsVariable();
        //testInterfaceAsVariable2();
        //testPrinter();
        //testNumberList();
        testNumberList2();
    }
    
}
