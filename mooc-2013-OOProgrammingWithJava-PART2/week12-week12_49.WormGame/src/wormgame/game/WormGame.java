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

        this.worm = new Worm(width / 2, height / 2, Direction.DOWN);
        this.rand = new Random();
        this.apple = addApple();

        addActionListener(this);
        setInitialDelay(2000);

    }

    private Apple addApple() {
        Apple newApple =  new Apple(rand.nextInt(width), rand.nextInt(height));
        while (worm.runsInto(newApple)) {
            newApple =  new Apple(rand.nextInt(width), rand.nextInt(height));
        }
        return newApple;
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
            this.apple = addApple();
        }
        if (worm.runsIntoItself()) {
            continues = false;
        } else if (worm.getHead().getX() == width || worm.getHead().getX() < 0) {
            continues = false;
        } else if (worm.getHead().getY() == height || worm.getHead().getY() < 0) {
            continues = false;
        }
        
        updatable.update();
        setDelay(1000 / worm.getLength());
    }

}
