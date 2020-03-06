
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author emaphis
 */
public class Grader {
    private ArrayList<Integer> grades;

    public Grader() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
    }

    public double average() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        int count = grades.size();
        return  sum / count;
    }

    public int passingCount() {
        int count = 0;
        for (Integer grade : grades) {
            if (grade >= 50) {
                count++;
            }
        }
        return count;
    }

    public double averagePassing() {
        double sum = 0;
        int count = 0;
        for (Integer grade : grades) {
            if (grade >= 50) {
                sum += grade;
                count++;
            }
        }
        return sum / count;
    }

    public double passPercentage() {
        int passing = passingCount();
        int participants = grades.size();
        return (100.0 * passing) / participants;
    }

    public int[] gradeDistribution() {
        int[] dist = new int[6];
        for (Integer grade : grades) {
            if (grade < 50) {
                dist[0]++;
            } else if (grade < 60) {
                dist[1]++;
            } else if (grade < 70) {
                dist[2]++;
            } else if (grade < 80) {
                dist[3]++;
            } else if (grade < 90) {
                dist[4]++;
            } else {
                dist[5]++;
            }
        }
        return dist;
    }
}
