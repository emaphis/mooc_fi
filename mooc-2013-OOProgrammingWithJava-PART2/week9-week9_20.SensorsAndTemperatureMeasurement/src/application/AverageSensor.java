
package application;

import java.util.List;
import java.util.ArrayList;


public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {
        if (sensors.isEmpty())
            return false;

        for (Sensor sensor : sensors) {
            if (!sensor.isOn())
                return false;
        }

        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn())
                sensor.on();
        }
    }

    @Override
    public void off() {
        int closed = 0;
        for (Sensor sensor : sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if (!isOn() || sensors.size() == 0)
            throw new IllegalStateException();

        int readingsTot = 0;
        for (Sensor sensor : sensors) {
            readingsTot += sensor.measure();
        }
        int avgReading = readingsTot / sensors.size();
        readings.add(avgReading);
        return avgReading;
    }   
}
