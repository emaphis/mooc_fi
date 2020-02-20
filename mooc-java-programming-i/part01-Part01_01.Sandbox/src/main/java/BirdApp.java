
import java.util.ArrayList;



/**
 * Example from part 5
 * @author emaphis
 */
public class BirdApp {
    static void example1() {
        Bird red = new Bird("Red");
        System.out.println(red.toString());

        Bird chuck = new Bird("Chuck");
        System.out.println(chuck.toString());

        if (red.equals(chuck)) {
            System.out.println(red + " equals " + chuck);
        } else {
            System.out.println("Not equal");
        }
    }

    // Equality and lists
    static void example2() {
        ArrayList<Bird> birds = new ArrayList<>();
        Bird red = new Bird("Red");

        if (birds.contains(red)) {
            System.out.println("Red is on the list");
        } else {
            System.out.println("Red is not on the list");
        }

        birds.add(red);

        if (birds.contains(red)) {
            System.out.println("Red is on the list");
        } else {
            System.out.println("Red is not on the list");
        }

        System.out.println("However!");

        red = new Bird("Red");


        if (birds.contains(red)) {
            System.out.println("Red is on the list");
        } else {
            System.out.println("Red is not on the list");
        }
    }

    public static void main(String[] args) {
        //example1();
        example2();
    }

}
