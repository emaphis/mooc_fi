
package dungeon;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Represents the dungeon.
 * The main game loop
 * @author emaphis
 */
public class Dungeon {
    private final int width;  // x
    private final int heigth; // y
    private int life;
    private final List<Thing> things;
    private final boolean move;
    private final Random rand;
    private final Scanner reader;

    // new Dungeon(10,10,5,14,true).run();
    public Dungeon(int width, int heigth, int numVampires, int life, boolean move) {
        this.width = width;
        this.heigth = heigth;
        this.life = life;
        this.move = move;
        this.rand = new Random(); // create before create things
        this.reader = new Scanner(System.in);
        this.things = new ArrayList<Thing>();

        // add player thing to beginning of list
        this.things.add(new Thing("@", 0, 0, width, heigth));

        // add vampires 
        for (int i = 0; i < numVampires; i++) {
            things.add(createVampire("v"));
        }
    }

    private Thing createVampire(String glyph) {
        int x = getXCoord();
        int y = getYCoord();
        return new Thing(glyph, x, y, width, heigth);
    }

    private int getXCoord() {
        return rand.nextInt(width);
    }

    private int getYCoord() {
        return rand.nextInt(heigth);
    }


    public void run() {
        while (life > 0) {
            System.out.println(life);
            System.out.println();
            printListThings();
            System.out.println();
            printMap();
            System.out.println();
            playerMoves();
            if (move)
                vampireMoves();

            if (things.size() == 1) {
                System.out.println("YOU WIN");
                break;
            }

            life--;
        }

        if (things.size() > 1)
            System.out.println("YOU LOSE");

    }

    private void printListThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    private void printMap() {
        for (int y = 0; y < heigth; y++) {
            for (int x = 0; x < width; x++) {
                Thing thing = getThingAt(x, y);
                if (thing == null) {
                    System.out.print(".");
                } else {
                    System.out.print(thing.getGlyph());
                }
            }
            System.out.println();
        }
    }

    /**
     * Return Thing at x,y coordinate
     * @param x
     * @param y
     * @return Thing
     */
    private Thing getThingAt(int x, int y) {
        for (Thing thing : things) {
            if (thing.getCoord().equalsXY(x, y))
                return thing;
        }
        return null;
    }

    private void vampireMoves() {
        for (int i = 1; i < things.size(); i++) {
            Thing thing = things.get(i);
            String vmpMove = calcVampireMove(thing);
            thing.move(vmpMove);
        }
    }

    //  a-<  w-^  s-v  d->
    private String calcVampireMove(Thing thing) {
        ArrayList<String> moves = new ArrayList<String>();

        if (thing.isLeftMoveValid()) {
            moves.add("a");
        }
        if (thing.isUpMoveValid()) {
            moves.add("w");
        }
        if (thing.isDownMoveValid()) {
            moves.add("s");
        }
        if (thing.isRightMoveValid()) {
            moves.add("d");
        }

        int pick = rand.nextInt(moves.size());
        return moves.get(pick);
    }

    private void playerMoves() {
        String moves;
        moves = reader.nextLine();
       // moves = "s"; //**a-dx  d-u w-dy  s-iy
        things.get(0).move(moves);
        checkVampireKill();
    }

    private void checkVampireKill() {
        Coord pos = things.get(0).getCoord();
        for (int i = 1; i < things.size(); i++) {
            Thing vamp = things.get(i);
            if (pos.equalsCoord(vamp.getCoord())) {
                things.remove(vamp);
            }
        }
    }

}
