
package dungeon;

/**
 * Base class to represent movable objects on map.
 * @author emaphis
 */
public class Thing {
    private String glyph;
    //private int x;
    //private int y;
    Coord coord;
    private int width;
    private int height;

    public Thing(String glyph, int x, int y, int width, int height) {
        this.glyph = glyph;
        this.coord = new Coord(x, y);
        this.width = width;
        this.height = height;
    }

    public String getGlyph() {
        return glyph;
    }
/*
    public int getX() {
        return coord.getX();
    }

    public int getY() {
        return coord.getY();
    }
*/

    public Coord getCoord() {
        return coord;
    }


    // it the same doesn't intersect
    public boolean intersects(Thing other) {
        return this != other && this.coord.equalsCoord(other.coord);
    }

    /**
     * move Thing given a string of instuctions
     * instructions: a-<  w-V  s-^  d->
     * @param moves string of move cammands
     */
    public void move(String moves) {

        for (int i = 0; i < moves.length(); i++) {

            char move = moves.charAt(i);
            int deltaX = coord.getX();
            int deltaY = coord.getY();

            if (move == 'w') {
                if (deltaY > 0)
                    deltaY--;
            } else if (move == 's') {
                if (deltaY < height)
                    deltaY++;
            } else if (move == 'a')
                if (deltaX > 0) {
                    deltaX--;
            } else if (move == 'd') {
                if (deltaX < width)
                    deltaX++;
            }

            verifyTheChange(deltaX, deltaY);
        }
    }

    
    private void verifyTheChange(int deltaX, int deltaY) {
        int newX = coord.getX() + deltaX;
        if (newX < 0)
            newX = 0;
        else if (newX > width)
            newX = width;
        

        int newY = coord.getY() + deltaY;
        if (newY < 0)
            newY = 0;
        else if (newY > height)
            newY = height;

        coord.setCoord(newX, newY);
    }

    @Override
    public String toString() {
        return glyph + " " + coord;
    }

}
