/*
 * Week 9 Example
 */
package inheritance;

/**
 *
 * @author emaphis
 */
public class Point3D extends Point {
    private int z;

    public Point3D(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    @Override
    protected String location() {
        return super.location() + ", " + z;
    }

    @Override
    public int manhattanDistanceFromOrigin() {
        // first ask the superclass for the distance based on x and y
        // and add the effect of the z coordinate to that result
        return super.manhattanDistanceFromOrigin() + Math.abs(z);
    }

}
