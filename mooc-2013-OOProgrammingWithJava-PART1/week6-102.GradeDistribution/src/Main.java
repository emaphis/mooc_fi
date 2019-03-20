import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        Grader grader = new Grader();

        System.out.println("Type exam scores, -1 when completes:");
        while (true) {
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade == -1) {
                break;
            }
            if (grade >= 0 && grade <= 60) {
                grader.addGrade(grade);
            }
        }

        System.out.println("Grade distribution:");
        grader.printGradeDistribution();
        System.out.println("Acceptance percentage: " + grader.calcAcceptance());

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
}
