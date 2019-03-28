

import java.util.Random;
import java.util.List;
import java.util.ArrayList;


public class SkiJumper {
    private final String name;
    private final List<SkiJump> jumps;
    private final Random random;

    public SkiJumper(String name) {
        this.name = name;
        this.jumps = new ArrayList<SkiJump>();
        this.random = new Random();
    }

    public String getName() {
        return name;
    }

    public void addJump(SkiJump jump) {
        jumps.add(jump);
    }

    public void printJumps() {
        for (SkiJump jump : jumps) {
            System.out.println(jump);
        }
    }

    public int getTotalScore() {
        int tot = 0;
        for (SkiJump jump : jumps) {
            tot += jump.getTotal();
        }
        return tot;
    }

    @Override
    public String toString() {
        return getName() + "(" + getTotalScore() + ")";
    }

    
}
