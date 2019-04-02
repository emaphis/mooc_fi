
package phonebook;

import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class PhonebookUI {
    private final Scanner reader;
    private Phonebook phonebook;

    public PhonebookUI() {
        this.reader = new Scanner(System.in);
        this.phonebook = new Phonebook();
    }

    public void start() {
        printHeader();
        commandLoop();
    }

    private void printHeader() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        System.out.println();
    }

    private void commandLoop() {
        String entry;
        while (true) {
            System.out.print("command: ");
            entry = reader.nextLine();
            if (entry.contains("x")) {
                break;
            } else if (entry.contains("1")) {
                addNumber();
            } else if (entry.contains("2")) {
                searchNumber();
            } else if (entry.contains("3")) {
                searchPersonNumber();
            } else if (entry.contains("4")) {
                addAddress();
            } else if (entry.contains("5")) {
                searchPerson();
            } else if (entry.contains("6")) {
                deletePerson();
            } else if (entry.contains("7")) {
                filterListing();
            }
        }
    }

    // 1 add a number
    private void addNumber() {
        String name;
        System.out.print("whose number: ");
        name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
        phonebook.addNumber(name, number);
        System.out.println();
    }

    // 2 search for a number
    private void searchNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        Set<String> numbers = phonebook.getNumbers(name);
        if (numbers == null)
            System.out.println("  not found");
        else {
            for(String number: numbers) {
                System.out.println(number);
            }
        }
        System.out.println();
    }

    // 3 search for a person by phone number
    private void searchPersonNumber() {
        System.out.print("number: ");
        String number = reader.nextLine();
        String name = phonebook.searchPesonNumber(number);
        if (name == null) {
            System.out.println(" not found");
        } else {
            System.out.println(" " + name);
        }
        System.out.println();
    }

    // 4 add an address
    private void addAddress() {
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();
        phonebook.addAddress(name, street, city);
        System.out.println("");
    }

    // 5 search for personal information
    private void searchPerson() {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        printPerson(name);
        System.out.println();
    }

    private void printPerson(String name) {
        Address address = phonebook.getAddress(name);
        Set<String> numbers = phonebook.getNumbers(name);
        if (address == null && numbers == null) {
            System.out.println("  not found");
        } else {
            if (address != null)
                System.out.println("  address: " + address);
            else
                System.out.println("  address unknown");
            
            if (numbers != null) {
                System.out.println("  phone numbers:");
                for (String number: numbers) {
                    System.out.println("   " + number);
                }
            } else {
                System.out.println("  phone number not found");
            }
        }
    }

    // 6 delete personal information
    private void deletePerson() {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        phonebook.deletePerson(name);
        System.out.println();
    }

    // 7 filtered listing
    private void filterListing() {
        System.out.print("Keyword (if empty, all listed): ");
        String keyword = reader.nextLine();
        Set<String> names = phonebook.findFiltered(keyword);
        //if (found)
        for (String name : names) {
            System.out.println();
            System.out.println(name);
            printPerson(name);
        }
        System.out.println();
    }

}
