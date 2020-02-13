
import java.util.ArrayList;
import java.util.Scanner;

public class PersonApp {

    public static void main(String[] args) {
        //testGrowOlder();
        //System.out.println("*********");
        //testLegalAge();
        //System.out.println("*********");
        //testWeightIndex();
        System.out.println("*********");
        //testList();
        //    testList2();
        //testNewConstructor();
        testSplit();
    }

    static void testGrowOlder() {
        Person pekka = new Person("Pekka");
        Person antti = new Person("Antti");

        pekka.growOlder();
        pekka.growOlder();

        antti.growOlder();

        System.out.println("Pekka's age: " + pekka.returnAge());
        System.out.println("Antti's age: " + antti.returnAge());

        int combined = pekka.returnAge() + antti.returnAge();

        System.out.println("Pekka's and Antti's combined age " + combined + " years");
    }

    static void testLegalAge() {
        Person pekka = new Person("Pekka");
        Person antti = new Person("Antti");

        int i = 0;
        while (i < 30) {
            pekka.growOlder();
            i = i + 1;
        }

        antti.growOlder();

        if (antti.isOfLegalAge()) {
            System.out.println(antti.getName() + " is of legal age");
        } else {
            System.out.println(antti.getName() + " is underage");
        }

        if (pekka.isOfLegalAge()) {
            System.out.println(pekka.getName() + " is of legal age");
        } else {
            System.out.println(pekka.getName() + " is underage ");
        }

        System.out.println(antti);
        System.out.println(pekka);
    }

    static void testWeightIndex() {
        Person matti = new Person("Matti");
        Person juhana = new Person("Juhana");

        matti.setHeight(180);
        matti.setWeight(86);

        juhana.setHeight(175);
        juhana.setWeight(64);

        System.out.println(matti.getName() + ", body mass index is " + matti.bodyMassIndex());
        System.out.println(juhana.getName() + ", body mass index is " + juhana.bodyMassIndex());
    }

    static void testList() {
        ArrayList<Person> persons = new ArrayList<>();

        Person john = new Person("John");
        persons.add(john);

        persons.add(new Person("Matthew"));
        persons.add(new Person("Martin"));

        for (Person person : persons) {
            System.out.println(person);
        }
    }

    static void testList2() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        // Read the names of persons from the user
        while (true) {
            System.out.print("Enter a name, empty will stop: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            // Add to the list of names
            persons.add(new Person(name));
        }

        System.out.println();
        System.out.println("Persons in total: " + persons.size());
        System.out.println("Persons: ");
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    static void testNewConstructor() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        // Read person information from the user
        while (true) {
            System.out.print("Enter name, empty will endl: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Enter the age of the person " + name + ":");

            int age = Integer.valueOf(scanner.nextLine());

            // add new Person
            persons.add(new Person(name, age));
        }

        System.out.println();
        System.out.println("Total number of persons: " + persons.size());
        System.out.println("Persons: ");
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    static void testSplit() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        // Read person information from the user
        System.out.println("Enter the person details separated by a comma, e.g.: Randall, 2");

        while (true) {
            System.out.print("Enter the details, empty will stop: ");
            String details = scanner.nextLine();
            if (details.isEmpty()) {
                break;
            }

            String[] parts = details.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1].strip());
            persons.add(new Person(name, age));
        }

        // Print the number of the entered persons, and the persons themselves
        System.out.println();
        System.out.println("Total number of persons: " + persons.size());
        System.out.println("Persons: ");

        for (Person person : persons) {
            System.out.println(person);
        }
    }


}
