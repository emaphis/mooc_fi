
package farmsimulator;


public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank() {
        this(2000.0); // capacity
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0.0;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getVolume() {
        return volume;
    }

    public double howMuchFreeSpace() {
        return capacity - volume; 
    }

    public void addToTank(double amount) {
        if (amount >= howMuchFreeSpace())
            volume = capacity;
        else
            volume += amount;
    }

    public double getFromTank(double amount)  {
        if (amount > volume) {
             volume = 0.0;
        }
        else {
            volume -= amount;
        }
        return volume;
    }

    @Override
    public String toString() {
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }

}
