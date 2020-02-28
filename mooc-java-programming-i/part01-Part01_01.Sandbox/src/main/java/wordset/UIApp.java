package wordset;


import java.util.Scanner;

/**
 * Week 6 example.
 * @author emaphis
 */
public class UIApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("((($)))");
        WordSet set = new WordSet();

        UserInterface userInterface = new UserInterface(set, scanner);
        userInterface.start();
    }

}
