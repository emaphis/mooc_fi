
package movingfigure;

import java.awt.Graphics;


public class Box extends Figure {
    private final int width;
    private final int length;

    public Box(int x, int y, int width, int length) {
        super(x, y);
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(getX(), getY(), width, length);
    }

    

}
