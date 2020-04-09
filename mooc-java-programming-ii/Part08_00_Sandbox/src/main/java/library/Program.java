/*
 * Week 11 Example
 */
package library;

import java.util.Scanner;
import library.domain.Book;
import library.ui.UserInterface;

/**
 *
 * @author emaphis
 */
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book("The ABCs of packages!");
        System.out.println("Hello packageworld: " + book.getName());

        UserInterface ui = new UserInterface(scanner);
        ui.start();
    }
}
