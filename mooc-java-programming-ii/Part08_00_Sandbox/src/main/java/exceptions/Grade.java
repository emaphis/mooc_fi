/*
 * Week 11 Exception
 */
package exceptions;

/**
 * Throwing exceptions
 * @author emaphis
 */
public class Grade {
    private int grade;

    public Grade(int grade) {
        if (grade < 0 || grade > 5) {
            throw new IllegalArgumentException("Grade must between 0 and 5 ");
        }

        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

}
