
package application;

import java.util.Random;


public class Thermometer implements Sensor {
    private Random random;
    private boolean on;

    public Thermometer() {
        this.random = new Random();
        this.on = false;
    }


    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void on() {
        on = true;
    }

    @Override
    public void off() {
        on = false;
    }

    @Override
    public int measure() {
        if (!on)
            throw new IllegalStateException("Thermometer is off!");

        return random.nextInt(60) - 30;
    }

}
