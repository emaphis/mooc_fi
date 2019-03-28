

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import java.util.List;


public class SkiJumper implements Comparable<SkiJumper> {
    private final String name;
    private final Map<Integer, SkiJump> jumps;
    private final Random random;
    private int round;

    public SkiJumper(String name) {
        this.name = name;
        this.jumps = new HashMap<Integer, SkiJump>();
        this.random = new Random();
        this.round = 0;
    }

    public String getName() {
        return name;
    }

    public void addJump(Integer round, SkiJump jump) {
        jumps.put(round, jump);
        this.round = round;
    }

    public SkiJump getJump(Integer round) {
        return jumps.get(round);
    }

    public void printJumps() {
        for (int i = 1; i <= round; i++){
            System.out.println(jumps.get(i));
        }
    }

    public int getTotalScore() {
        int tot = 0;
        for (int i = 1; i <= jumps.size(); i++) {
            SkiJump jump = jumps.get(i);
            if (jump == null) {
                System.out.print("getTotalScore() error!"); // error
            } else {
                tot += jump.getTotal();
            }
        }
        return tot;
    }

    public List<SkiJump> getJumps() {
        List<SkiJump> jumpList =  new ArrayList<SkiJump>(jumps.values());
        //Collections.sort(jumpList);
        
        return jumpList; 
    }

    @Override
    public String toString() {
        String name1 = getName(); // TODO:
        int score= getTotalScore();
        return name1 + " (" + score + " points)";
    }


    @Override
    public int compareTo(SkiJumper other) {
        return this.getTotalScore() - other.getTotalScore();
    }

}
