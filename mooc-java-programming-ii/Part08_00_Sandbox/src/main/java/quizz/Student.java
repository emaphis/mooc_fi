
package quizz;

/**
 *
 * @author emaphis
 */
public class Student extends Person {
    private int credits;

    public Student(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    @Override
    public String toString() {
        return super.toString() + credits + " credits";
    }
}
