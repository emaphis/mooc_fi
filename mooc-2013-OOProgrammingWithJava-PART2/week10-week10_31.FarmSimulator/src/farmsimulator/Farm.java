
package farmsimulator;

import java.util.ArrayList;
import java.util.List;


public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public String getOwner() {
        return owner;
    }

    public void addCow(Cow cow) {
        cows.add(cow);
    }

    public void installMilkingRobot(MilkingRobot robot) {
        barn.installMilkingRobot(robot);
    }

    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }

    public void manageCows() {
        barn.takeCareOf(cows);
    }

    @Override
    public String toString() {
        String str = "";
        str += "Farm owner: " + owner + "\n";
        str += "Barn bulk tank: " + barn.getBulkTank() + "\n";
        if (cows.isEmpty()) {
            str += "No cows.";
        } else {
            str += "Animals: \n";
            for (Cow cow : cows) {
                str += "        " + cow + "\n";
            }
        }
        return str;
    }

}
