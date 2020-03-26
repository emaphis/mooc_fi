/*
 * Week 8 example
 */
package hashmaps;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class TaskTracker {
    private HashMap<String, ArrayList<Integer>> competedExercises;

    public TaskTracker() {
        this.competedExercises = new HashMap<>();
    }

    public void add(String user, int exercise) {
        // add empty list for a new user.
        competedExercises.putIfAbsent(user, new ArrayList<>());

        // then add new exercise.
        ArrayList<Integer> completed = competedExercises.get(user);
        completed.add(exercise);

        // more concise.
        //competedExercises.get(user).add(exercise);
    }

    public void print() {
        for (String name : competedExercises.keySet()) {
            System.out.println(name + ": " + competedExercises.get(name));
        }
    }
}
