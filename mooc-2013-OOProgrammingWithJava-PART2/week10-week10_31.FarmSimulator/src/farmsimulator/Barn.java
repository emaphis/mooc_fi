
package farmsimulator;

import java.util.Collection;


public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;

    public Barn(BulkTank tank) {
        this.tank = tank;
        this.robot = null;
    }

    public BulkTank getBulkTank() {
        return tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        robot = milkingRobot;
        milkingRobot.setBulkTank(tank);
    }

    public void takeCareOf(Cow cow) {
        if (robot == null)
            throw new IllegalStateException("no milking robot");

        robot.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cows) {
        if (robot == null)
            throw new IllegalStateException("no milking robot");

        for (Cow cow : cows) {
            robot.milk(cow);
        }
    }

    @Override
    public String toString() {
        return tank.toString();
    }

}
