
package application;

/**
 *
 * @author emaphis
 */
public class StandardSensor implements Sensor {
    private int data;

    public StandardSensor(int data) {
        this.data = data;
    }

    @Override
    public boolean isOn() { return true; }

    @Override
    public void setOn() { }

    @Override
    public void setOff() { }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Sensor is not on");
        }

        return data;
    }

}
