
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
        part1();
        System.out.println("oooooo");
        part2();
        System.out.println("oooooo");
        part3();
        System.out.println("oooooo");
        part4();
        System.out.println("oooooo");
        part5();
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    static void part5() {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }

    static void part1() {
        Person ada = new Person("Ada Lovelace", "24 Madox Streat W1S 2WN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");

        System.out.println(ada);
        System.out.println(esko);
    }

    static void part2() {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits " + ollie.credits());
    }

    static void part3() {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        ollie.study();
        System.out.println(ollie);
    }

    static void part4() {
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
            ollie.study();
            i = i + 1;
        }
        System.out.println(ollie);
    }
}
