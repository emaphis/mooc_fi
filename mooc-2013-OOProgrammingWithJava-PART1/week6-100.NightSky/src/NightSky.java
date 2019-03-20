
import java.util.Random;


public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsinLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsinLastPrint = 0;
    }

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public void printLine() {
        Random random = new Random();

        for (int i = 0; i < width; i++) {
            if (density > random.nextDouble()) {
                System.out.print("*");
                starsinLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public void print() {
        starsinLastPrint = 0;
        for (int i = 0; i < height; i++) {
            printLine();
        }
    }

    public int starsInLastPrint() {
        return starsinLastPrint;
    }
}
