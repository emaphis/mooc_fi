/*
 * Week 9 Example
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class ReadableApp {

    public static void main(String[] args) {
        //example1();
        //System.out.println("ooooooo");
        //example2();
        //System.out.println("ooooooo");
        //example3();
        //System.out.println("ooooooo");
        //example4();
        System.out.println("ooooooo");
        examples5();
    }

    private static void example1() {
        TextMessage message = new TextMessage("ope", "It's going grreat!");

        ArrayList<TextMessage> messages = new ArrayList<>();
        messages.add(message);

        for (TextMessage message1 : messages) {
            System.out.println(message1.read());
        }
    }

    private static void example2() {
        ArrayList<String> pages = new ArrayList<>();
        pages.add("Split your method into short, readable entities.");
        pages.add("Seperate the user-interface logic from the application logic.");
        pages.add("Always program a small part initially that solves a part of the problem.");
        pages.add("Practice makes the master. Try different out things for yourself and work on your own projects.");

        Ebook book = new Ebook("Tips for programming.", pages);

        int page = 0;
        while (page < book.pages()) {
            System.out.println(book.read());
            page++;
        }
    }

    private static void example3() {
        ArrayList<Readable> readingList = new ArrayList<>();

        readingList.add(new TextMessage("ope", "never been programming before..."));
        readingList.add(new TextMessage("ope", "gonna love it i think!"));
        readingList.add(new TextMessage("ope", "give me something more challenging! :)"));
        readingList.add(new TextMessage("ope", "you think i can do it?"));
        readingList.add(new TextMessage("ope", "up here we send several messages each day"));

        ArrayList<String> pages = new ArrayList<>();
        pages.add("A method can call itself.");

        readingList.add(new Ebook("Introduction to Recursion.", pages));

        for (Readable readable : readingList) {
            System.out.println(readable.read());
        }
    }

    // Interfaces as method parameters
    private static void example4() {
        TextMessage message = new TextMessage("ope", "Oh wow, this printer knows how to print these as well!");

        ArrayList<String> pages = new ArrayList<>();
        pages.add("Values common to both {1, 3, 5} and {2, 3, 4, 5} are {3, 5}.");
        Ebook book = new Ebook("Introduction to University Mathematics.", pages);

        Printer printer = new Printer();
        printer.print(message);
        printer.print(book);
    }

    private static void examples5() {
        ReadingList jonisList = new ReadingList();
        jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
        jonisList.add(new TextMessage("arto", "have you checked the submissions yet?"));

        System.out.println("Joni's to-read: " + jonisList.toRead());

//        ReadingList jonisList = new ReadingList();
        int i = 0;
        while (i < 1000) {
            jonisList.add(new TextMessage("arto", "teitkö jo testit?"));
            i = i + 1;
        }

        System.out.println("Joni's to-read: " + jonisList.toRead());
        System.out.println("Delegating the reading to Verna");

        ReadingList vernasList = new ReadingList();
        vernasList.add(jonisList);
        vernasList.read();

        System.out.println();
        System.out.println("Joni's to-read: " + jonisList.toRead());
    }
}
