
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class SkiJump {
    private final List<Integer> scores;
    private int length;
    private final Random random;

    public SkiJump(int round) {
        this.scores = new ArrayList<Integer>();
        this.length = 0;
        this.random = new Random();
    }

    public void jump() {
        length = calcRandom(60, 120);
        judgeJump();
    }

    // from formula
    private int calcRandom(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    private void judgeJump() {
        for (int i = 0; i < 5; i++) {
            scores.add(calcRandom(10, 20));
        }
    }

    // return total score of jump.
    public int getScore() {
        int ret = 0;
        for (int score : getMiddleScores()) {
            ret += score;
        }
        return length + ret;
    }

    public int getLength() {
        return length;
    }

    private List<Integer> getMiddleScores() {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        Collections.sort(scores);
        for (int i = 1; i < scores.size() - 1; i++) {
            ret.add(scores.get(i));
        }
        return ret;
    }
    
    public void printScores() {
        System.out.print("[");
        for (int i = 0; i < scores.size() - 1; i++) {
            System.out.print(scores.get(i) + ", ");
        }
        System.out.println(scores.get(scores.size()-1) + "]");
    }

    @Override
    public String toString() {
        return "Length " + length + " " + scores;
    }

}
