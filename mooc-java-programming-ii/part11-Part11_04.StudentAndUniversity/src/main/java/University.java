
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author emaphis
 */
public class University {
    private String name;
    List<Student> students;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }


}
