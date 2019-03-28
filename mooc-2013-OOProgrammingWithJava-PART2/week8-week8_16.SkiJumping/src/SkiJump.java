
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

public class SkiJump {
    private final ArrayList<Integer> scores;
    private int length;
    private final Random random;
    private final int round;

    public SkiJump(int round) {
        this.scores = new ArrayList<Integer>(5);
        this.length = 0;
        this.random = new Random();
        this.round = round;
    }

    public void jump() {
        length = calcJump();
        judgeJump();
    }

    private int calcScore() {
        return random.nextInt(10) + 10;
    }

    private int calcJump() {
        return random.nextInt(60) + 60;
    }

    private void judgeJump() {
        for (int i = 0; i < 5; i++) {
            scores.add(i, calcScore());
        }
    }

    // return total of middle three scores
    public int middleThree() {
        int tot = 0;
        Collections.sort(scores);
        // total middle three
        for (int i = 1; i < 4; i++) {
            tot += scores.get(i);
        }
        return tot;
    }

    // return total score of jump.
    public int getTotal() {
        return length + middleThree();
    }

    public int getLength() {
        return length;
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
        String out = "Length" + length + "[";
        for (Integer score : scores) {
            out += score + " ";
        }
        out += "]";
        return out;
    }


}
