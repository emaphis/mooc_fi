
package dungeon;

/**
 * Class to represent movable objects: player and vampire.
 * @author emaphis
 */
public class Thing {
    private final String glyph;
    private final Coord coord;
    private final int width;
    private final int height;

    public Thing(String glyph, int x, int y, int width, int heigth) {
        this.glyph = glyph;
        this.coord = new Coord(x, y);
        this.width = width;
        this.height = heigth;
    }

    public String getGlyph() {
        return glyph;
    }

    public Coord getCoord() {
        return coord;
    }

    // it the same doesn't intersect
    public boolean intersects(Thing other) {
        return this != other && this.coord.equalsCoord(other.coord);
    }

    /**
     * move Thing given a string of instructions
     * instructions: (a-<  w-^ s-v d->)
     * @param moves string of move commands
     */
    public void move(String moves) {

        for (int i = 0; i < moves.length(); i++) {

            char move = moves.charAt(i);
            int deltaX = coord.getX();
            int deltaY = coord.getY();

            // checkig for valid move is now redundant, but will keep.
            if (move == 'w') {
                if (isUpMoveValid())
                    deltaY--;
            } else if (move == 's') {
                if (isDownMoveValid())
                    deltaY++;
            } else if (move == 'a') {
                if (isLeftMoveValid())
                    deltaX--;
            } else if (move == 'd') {
                if (isRightMoveValid())
                    deltaX++;
            }

            coord.setCoord(deltaX, deltaY);
        }
    }

    public boolean isUpMoveValid() {  // w
        return coord.getY() > 0;
    }

    public boolean isDownMoveValid() {  // s
        return coord.getY() + 1 < height;
    }

    public boolean isLeftMoveValid() {  // a
        return coord.getX() > 0;
    }
 
    public boolean isRightMoveValid() {  // d
        return coord.getX() + 1 < width;
    }


    @Override
    public String toString() {
        return glyph + " " + coord;
    }

}
