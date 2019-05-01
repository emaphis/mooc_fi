package wormgame;

import javax.swing.SwingUtilities;
import wormgame.domain.Worm;
import wormgame.gui.UserInterface;
import wormgame.game.WormGame;

public class Main {

    static void testWorm() {
        Worm worm = new Worm(5, 5, Direction.RIGHT);
        System.out.println(worm.getPieces());
        worm.move();
        System.out.println(worm.getPieces());
        worm.move();
        System.out.println(worm.getPieces());
        worm.move();
        System.out.println(worm.getPieces());

        worm.grow();
        System.out.println(worm.getPieces());
        worm.move();
        System.out.println(worm.getPieces());

        worm.setDirection(Direction.LEFT);
        System.out.println(worm.runsIntoItself());
        worm.move();
        System.out.println(worm.runsIntoItself());
    }

    public static void main(String[] args) {
        // write test code here
        testWorm();
    }
}
