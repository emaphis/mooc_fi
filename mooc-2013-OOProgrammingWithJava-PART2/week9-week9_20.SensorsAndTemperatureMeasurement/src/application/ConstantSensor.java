
package application;


public class ConstantSensor implements Sensor {
    private int measurment;

    public ConstantSensor(int measurment) {
        this.measurment = measurment;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() { }

    @Override
    public void off() { }

    @Override
    public int measure() {
        return measurment;
    }

}
