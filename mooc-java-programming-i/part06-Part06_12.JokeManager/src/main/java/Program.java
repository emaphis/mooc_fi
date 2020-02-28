
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        JokeManager manager = new JokeManager();

        UserInterface ui = new UserInterface(manager, scanner);

        System.out.println("What a joke!");
        ui.start();
    }

    static void part1() {
        JokeManager manager = new JokeManager();
        manager.addJoke("What is red and smells of blue paint? - Red paint.");
        manager.addJoke("What is blue and smells of red paint? - Blue paint.");

        //System.out.println("****** got here oooooooo");
        System.out.println("Drawing jokes:");
        for (int i = 0; i < 5; i++) {
            System.out.println(manager.drawJoke());
        }

        System.out.println("");
        System.out.println("Printing jokes:");
        manager.printJokes();
    }
}
