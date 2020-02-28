package grades;

import java.util.Scanner;

/**
 * Week 6 example
 *
 * @author emaphis
 */
public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println();
        printGradeDistribution();
    }

    void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            int score = Integer.valueOf(input);

            if (score < 0 || score > 100) {
                System.out.println("Inpossibe number");
                continue;
            }

            register.addGradeBasedOnPoints(score);
        }
    }

    void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println();

            grade = grade - 1;
        }
    }

    void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
