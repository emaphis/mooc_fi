
package farmsimulator;


public class MilkingRobot {
    private BulkTank tank;

    public MilkingRobot() {
        this.tank = null;
    }

    public BulkTank getBulkTank() {
        return tank; 
    }

    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }

    public void milk(Milkable milkable) {
        double amount = milkable.milk();
        if (tank == null)
            throw new IllegalStateException("not tank");
        else
            tank.addToTank(amount);
    }

}
