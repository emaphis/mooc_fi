
package wormgame.domain;


public class Piece {
    private final int x;
    private final int y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean runsInto(Piece piece) {
        return this.x == piece.x && this.y == piece.y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
