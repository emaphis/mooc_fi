
import java.util.Scanner;


/**
 *
 * @author emaphis
 */
public class UserInterface {
    private Scanner scanner;
    private Grader grader;

    public UserInterface(Scanner scanner, Grader grader) {
        this.scanner = scanner;
        this.grader = grader;
    }


    public void run() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int grade = Integer.valueOf(scanner.nextLine());

            if (grade == -1) {
                break;
            }

            grader.addGrade(grade);
        }

        System.out.println("Point average (all): " + grader.average());
        if (grader.passingCount() > 0) {
            System.out.println("Point average (passing): " + grader.averagePassing());
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage:" + grader.passPercentage());
        int[] dist = grader.gradeDistribution();
        System.out.println("5: " + stars(dist[5]));
        System.out.println("4: " + stars(dist[4]));
        System.out.println("3: " + stars(dist[3]));
        System.out.println("2: " + stars(dist[2]));
        System.out.println("1: " + stars(dist[1]));
        System.out.println("0: " + stars(dist[0]));
    }

    private String stars(int count) {
        String out = "";
        for (int i = 0; i < count; i++) {
            out += "*";
        }
        return out;
    }
}
