package grades;

import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class GradeRegister {

    ArrayList<Integer> grades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
    }

    void addGradeBasedOnPoints(int score) {
        grades.add(scoreToGrades(score));
    }

    int numberOfGrades(int grade) {
        int count = 0;
        for (int recieved : grades) {
            if (recieved == grade) {
                count++;
            }
        }

        return count;
    }

    int scoreToGrades(int score) {
        int grade = 0;

        if (score < 50) {
            grade = 0;
        } else if (score < 60) {
            grade = 1;
        } else if (score < 70) {
            grade = 2;
        } else if (score < 80) {
            grade = 3;
        } else if (score < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

}
