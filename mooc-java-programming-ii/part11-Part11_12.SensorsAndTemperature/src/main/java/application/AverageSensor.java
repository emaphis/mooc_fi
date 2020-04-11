
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author emaphis
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    @Override
    public boolean isOn() {
        return sensors.stream().noneMatch((sensor) -> (!sensor.isOn()));
    }

    @Override
    public void setOn() {
        sensors.forEach((sensor) -> {
            sensor.setOn();
        });
    }

    @Override
    public void setOff() {
        sensors.forEach((sensor) -> {
            sensor.setOff();
        });
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Average sensor measered while it is off");
        }

        int sum = 0;
        sum = sensors.stream().map((sensor) -> sensor.read()).map((reading) -> {
            readings.add(reading);
            return reading;
        }).map((reading) -> reading).reduce(sum, Integer::sum);

        return sum / sensors.size();
    }

    public List<Integer> readings() {
        return readings;
    }

}
