
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;


public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double probablity) {
        Random rand = new Random();
        for(int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                if (probablity >= rand.nextDouble()) {
                    turnToLiving(x, y);
                } else {
                    turnToDead(x, y);
                }
            }
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        boolean alive = false;
        if (isValidCell(x, y))
            alive = getBoard()[x][y];
        return alive;
    }

    @Override
    public void turnToLiving(int x, int y) {
        if (isValidCell(x, y))
            getBoard()[x][y] = true;
    }

    @Override
    public void turnToDead(int x, int y) {
        if (isValidCell(x, y))
            getBoard()[x][y] = false;
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int num = 0;
        if (isNeighbourAlive(x, y, -1, -1)) num++;  // NW
        if (isNeighbourAlive(x, y,  0, -1)) num++;  // N
        if (isNeighbourAlive(x, y,  1, -1)) num++;  // NE
        if (isNeighbourAlive(x, y,  1,  0)) num++;  // E
        if (isNeighbourAlive(x, y,  1,  1)) num++;  // SE
        if (isNeighbourAlive(x, y,  0,  1)) num++;  // S
        if (isNeighbourAlive(x, y, -1,  1)) num++;  // SW
        if (isNeighbourAlive(x, y, -1,  0)) num++;  // W
        return num;
    }

    private boolean isNeighbourAlive(int x, int y, int dx, int dy) {
        return isValidCell(x+dx, y+dy) && isAlive(x+dx,y+dy);
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if (isAlive(x, y) && livingNeighbours < 2) {
            turnToDead(x, y);
        } else if (isAlive(x, y) && (livingNeighbours == 2 || livingNeighbours == 3)) {
            turnToLiving(x, y);
        } else if (isAlive(x, y) && livingNeighbours > 3) {
            turnToDead(x, y);
        } else if (!isAlive(x, y) && livingNeighbours == 3) {
            turnToLiving(x, y);
        }   
    }

    private boolean isValidCell(int x, int y) {
        return (x >= 0 && x < getWidth()) &&  (y >= 0 && y < getHeight());
    }

}
