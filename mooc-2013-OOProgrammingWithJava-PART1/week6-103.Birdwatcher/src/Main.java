
import java.util.Scanner;

public class Main {
    Scanner reader;
    BirdData birds;

    public Main() {
        this.reader = new Scanner(System.in);
        this.birds = new BirdData();
    }

    public void addBird() {
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Latin Name: ");
        String latinName = reader.nextLine();
        birds.AddBird(name, latinName);
    }

    public void AddObservation() {
        System.out.print("What was observed:? ");
        String name = reader.nextLine();
        birds.ObserveBird(name);
    }

    public void showBird() {
        System.out.print("What? ");
        String name = reader.nextLine();
        Bird bird = birds.getBird(name);
        if (bird != null) {
            System.out.println(bird);
        } else {
            System.out.println("Is not a bird!");
        }
    }

    public void runUI() {
        String input;
        while (true) {
            System.out.print("? ");
            input = reader.nextLine();

            if (input.equals("Quit")) {
                break;
            }
            if (input.equals("Add")) {
                addBird();
            }
            if (input.equals("Observation")) {
                AddObservation();
            }
            if (input.equals("Statistics")) {
                birds.printBirds();
            }
            if (input.equals("Show")) {
                showBird();
            }
        }
    }

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

    Main main = new Main();
    main.runUI();
    }

}
