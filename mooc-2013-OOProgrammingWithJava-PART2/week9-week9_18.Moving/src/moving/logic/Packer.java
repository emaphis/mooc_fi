
package moving.logic;

import java.util.List;
import java.util.ArrayList;
import moving.domain.Box;
import moving.domain.Thing;

public class Packer {
    int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();

        Box box = new Box(boxesVolume);
        for (Thing thing : things) {
            if (!box.addThing(thing)) {
                boxes.add(box);
                box = new Box(boxesVolume);
                box.addThing(thing);
            }
        }
        box.addThing(box);

        return boxes;
    }

}
