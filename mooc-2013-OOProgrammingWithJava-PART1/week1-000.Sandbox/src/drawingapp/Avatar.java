
package drawingapp;

import java.awt.Graphics;


public class Avatar {

    private int x;
    private int y;

    public Avatar(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int movingX, int movingY) {
        x += movingX;
        y += movingY;
    }

    public void draw(Graphics graphics) {
        graphics.fillOval(x, y, 10, 10);
    }

}
