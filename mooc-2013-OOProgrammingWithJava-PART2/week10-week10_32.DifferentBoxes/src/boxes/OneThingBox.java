
package boxes;


public class OneThingBox extends Box {
    private Thing aThing;

    public OneThingBox() {
        this.aThing = null;
    }

    @Override
    public void add(Thing thing) {
        if (aThing == null)
            aThing = thing;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (aThing == null)
            return false;
        return aThing.equals(thing);
    }

}
