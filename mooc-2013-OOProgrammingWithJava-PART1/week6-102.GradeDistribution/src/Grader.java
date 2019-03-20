
import java.util.ArrayList;

public class Grader {
    double accepted;
    int allScores;
    int gradeCategory[]; // 0 -> 5;

    public Grader() {
        this.accepted = 0.0;
        this.allScores = 0;
        this.gradeCategory = new int[6];
    }

    public void addGrade(int grade) {
        int category = getGradeCategory(grade);
        allScores++;
        gradeCategory[category]++;
        if (category != 0) {    
            accepted++;
        }
    }

    private int getGradeCategory(int grade) {
        if (grade < 30) {
            return 0;
        } else if (grade < 35) {
            return 1;
        } else if (grade < 40) {
            return 2;
        } else if (grade < 45) {
            return 3;
        } else if (grade < 50) {
            return 4;
        } else  {  // grade <= 60
            return 5;
        }
    }

    public void printGradeDistribution() {
        for (int index = gradeCategory.length - 1; index >= 0; index--) {
            printGrade(index);
        }
    }

    private void printGrade(int index) {
        System.out.print(index + ": ");
        for (int i = 0; i < gradeCategory[index]; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public double calcAcceptance() {
        if (allScores != 0)
            return 100.0 * (accepted / allScores);
        else
            return 0.0;
    }
}
