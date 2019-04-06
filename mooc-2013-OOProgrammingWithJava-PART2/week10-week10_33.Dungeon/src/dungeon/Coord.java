
package dungeon;


public class Coord {
    private int x;
    private int y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
    public boolean equalsCoord(Coord other) {
        return this.x == other.x && this.y == other.y;
    }

    public boolean equalsXY(int x, int y) {
        return this.x == x && this.y == y;
    }

    public void setCoord(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    
    /*
    public void add(Coord other) {
        this.x += other.getX();
        this.y += other.getY();
    }
*/  

    @Override
    public String toString() {
        return x + " " + y;
    }
}
