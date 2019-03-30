
package moving.logic;

import java.util.List;
import java.util.ArrayList;
import moving.domain.Box;
import moving.domain.Thing;

public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();

        for (Thing thing : things) {
            Box box = new Box(boxesVolume);
            box.addThing(thing);
            boxes.add(box);
        }

        return boxes;
    }

}
