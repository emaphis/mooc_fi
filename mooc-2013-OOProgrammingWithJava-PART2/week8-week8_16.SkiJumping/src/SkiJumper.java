
import java.util.ArrayList;
import java.util.List;


public class SkiJumper implements Comparable<SkiJumper>
{
    private final String name;
    private final List<Integer> jumps;
    private int totalScore;

    public SkiJumper(String name) {
        this.name = name;
        this.jumps = new ArrayList<Integer>();
        this.totalScore = 0;
    }

    public String getName() {
        return name;
    }

    public void addJump(SkiJump jump) {
        jumps.add(jump.getLength());
        totalScore += jump.getScore();
    }

    public void printJumps() {
        for (Integer jump : jumps) {
            System.out.println(jump);
        }
    }

    public List<Integer> getJumps() {
        return jumps; 
    }

    @Override
    public String toString() {
        String name1 = getName(); // TODO:
  //      int totalScore= getTotalScore();
        return name1 + " (" + totalScore + " points)";
    }

    @Override
    public int compareTo(SkiJumper other) {
        return other.totalScore - this.totalScore;
    }

}
