
import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class ExerciseManagement {
    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }


    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : exercises) {
            list.add(exercise.getName());
        }
        return list;
    }

    public void add(String exercisea) {
        exercises.add(new Exercise(exercisea));
    }

    public void markAsCompleted(String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                ex.setCompeted(true);
            }
        }
    }

    public boolean isCompeted(String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompeted();
            }
        }
        return false;
    }
}
