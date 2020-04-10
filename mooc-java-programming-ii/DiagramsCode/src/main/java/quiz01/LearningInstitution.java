package quiz01;

import java.util.ArrayList;

public class LearningInstitution {
    private ArrayList<Teacher> teachers;

    public LearningInstitution() {
        this.teachers = new ArrayList<>();
    }

    public void addTreacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public String toString() {
        return "Number of teachers in the learning institution: " + teachers.size();
    }
}
