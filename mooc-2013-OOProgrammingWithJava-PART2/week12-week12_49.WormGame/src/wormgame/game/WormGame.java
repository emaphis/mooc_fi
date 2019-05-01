package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Worm;
import wormgame.domain.Apple;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;
    private Random rand;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);

        this.worm = new Worm(width / 2, height / 2, Direction.DOWN);
        this.rand = new Random();
        this.apple = new Apple(rand.nextInt(width), rand.nextInt(height));
    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Worm getWorm() {
        return worm;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        worm.move();
        if (worm.runsInto(apple)) {
            worm.grow();
            this.apple = new Apple(rand.nextInt(width), rand.nextInt(height));
        }
        if (worm.runsIntoItself()) {
            continues = false;
        } else if (worm.getX() == width || worm.getX() < 0) {
            continues = false;
        } else if (worm.getY() == height || worm.getY() < 0) {
            continues = false;
        }
        
        updatable.update();
        setDelay(1000 / worm.getLength());

    }


}
