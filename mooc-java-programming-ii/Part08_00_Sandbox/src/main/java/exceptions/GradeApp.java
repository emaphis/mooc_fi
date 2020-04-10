/*
 * Week 11 Example
 */
package exceptions;

/**
 * Throwing exception.
 * @author emaphis
 */
public class GradeApp {
    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        Grade grade = new Grade(3);
        System.out.println(grade.getGrade());

        Grade illegalGrade = new Grade(22);
        System.out.println(illegalGrade.getGrade());
    }
}
