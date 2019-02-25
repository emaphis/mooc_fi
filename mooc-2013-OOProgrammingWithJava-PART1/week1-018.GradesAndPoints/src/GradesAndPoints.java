
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]; ");
        int grade = Integer.parseInt(reader.nextLine());

        if (grade < 30) {
            System.out.println("Grade: failed");
        } else if (grade < 35) {
            System.out.println("Grade: 1");
        } else if (grade < 40) {
            System.out.println("Grade: 2");
        } else if (grade < 45) {
            System.out.println("Grade: 3");
        } else if (grade < 50) {
            System.out.println("Grade: 4");
        } else if (grade < 60) {
            System.out.println("Grade: 5");
        }
    }
}
