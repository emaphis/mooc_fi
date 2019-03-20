
import java.util.ArrayList;

public class BirdData {
    private final ArrayList<Bird> birds;

    public BirdData() {
        this.birds = new ArrayList<Bird>();
    }

    public void AddBird(String name, String latinName) {
        Bird bird = new Bird(name, latinName);
        birds.add(bird);
    }

    public void ObserveBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.observe();
            }
        }
    }

    public Bird getBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name))
                return bird;
        }
        return null;
    }

    public void printBirds() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
}
