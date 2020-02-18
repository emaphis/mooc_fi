
import java.util.Scanner;



/**
 * Exercise the Person2 class.
 * @author emaphis
 */
public class Person2App {

    static void processPerson() {
        Scanner reader = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = reader.nextLine();
        System.out.println("What's your age?");
        int age = Integer.valueOf(reader.nextLine());
        System.out.println("What's your wieght?");
        double weight = Double.valueOf(reader.nextLine());
        System.out.println("What's your height?");
        double height = Double.valueOf(reader.nextLine());

        Person2 person = new Person2(name, age, weight, height);
        System.out.println(person.getBMI());
    }

    static void newConstructor() {
        Person2 paul = new Person2("Paul", 24);
        Person2 ada = new Person2("Ada");

        System.out.println(paul);
        System.out.println(ada);
    }

    static void growOlder() {
        Person2 paul = new Person2("Paul", 24);
        System.out.println(paul);

        paul.growOlder();
        System.out.println(paul);

        paul.growOlder(10);
        System.out.println(paul);
    }

    public static void main(String[] args) {
        //processPerson();
        newConstructor();
        System.out.println("oooooooooooooo");
        growOlder();
    }
}
