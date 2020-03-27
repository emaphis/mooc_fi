package quizz;

/**
 *
 * @author emaphis
 */
public class PersonApp {

    public static void main(String[] args) {
        Student student = new Student("Kenny", 23, 140);

        Person person = student;
        Object object = student;
        System.out.print(student + ", ");
        System.out.print(person + ", ");
        System.out.println(object);
    }
}
