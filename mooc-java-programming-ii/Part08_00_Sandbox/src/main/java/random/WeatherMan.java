
package random;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author emaphis
 */
public class WeatherMan {
    private Random random;

    public WeatherMan() {
        this.random = new Random();
    }

    public String forecast() {
        double probability = random.nextDouble();

        if (probability <= 0.1) {
            return "it rains";
        } else if (probability <= 0.4) {
            return "It snows";
        } else {
            return "The sun shines";
        }
    }

    public int makeAForecast() {
        return (int) (4 * random.nextGaussian() - 3);
    }
}
