
package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;


public class Worm {

    private Direction direction;
    private List<Piece> body;
    private final int MATURE_LENGTH = 3;
    private boolean hasEaten;

    public Worm(int x, int y, Direction originalDirection) {
        this.direction = originalDirection;
        this.body = new ArrayList<Piece>();
        this.body.add(new Piece(x, y));
        this.hasEaten = false;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getLength() {
        return body.size();
    }

    public List<Piece> getPieces() {
        return body;
    }

    public Piece getHead() {
        return body.get(getLength() - 1);
    }


    /**
     * Moves the worms body.
     * Adds a new head in direction of worm
     * Removes tail if worm not growing().
     */
    public void move() {
        addHead();
        if (!growing())
            removeTail();
        hasEaten = false;
    }

    public void grow() {
        hasEaten = true;
    }

    private boolean growing() {
        return getLength() <= MATURE_LENGTH || hasEaten;
    }

    private void addHead() {
        int newX = getHead().getX();
        int newY = getHead().getY();

        if (direction == Direction.UP) {
            newY--;
        } else if (direction == Direction.DOWN) {
            newY++;
        } else if (direction == Direction.LEFT) {
            newX--;
        } else if (direction == Direction.RIGHT) {
            newX++;
        }

        body.add(new Piece(newX, newY));
    }

    private void removeTail() {
        body.remove(0);
    }

    public boolean runsInto(Piece other) {
        for (Piece piece : body) {
            if (piece.getX() == other.getX() && piece.getY() == other.getY()){
                return true;
            }
        }
        return false;
    }

    public boolean runsIntoItself() {
        for (int i = 0; i < getLength() - 1; i++) {
            if (getHead().runsInto(body.get(i))) {
                return true;
            }
        }
        return false;
    }

}
