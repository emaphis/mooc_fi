
package application;

import java.util.Random;

/**
 *
 * @author emaphis
 */
public class TemperatureSensor implements Sensor {
    private Random generator;
    private boolean on;

    public TemperatureSensor() {
        this.generator = new Random();
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setOn() {
        on = true;
    }

    @Override
    public void setOff() {
        on = false;
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Illegal read while sensor is off");
        }

        return generator.nextInt(61) - 30;
    }

}
