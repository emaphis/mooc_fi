/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author emaphis
 */
public class Dungeon {
    private int width;  // x
    private int heigth; // y
    private int life;
    private List<Thing> things;
    private boolean move;
    private Random rand;
    private Scanner reader;

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
            int x = getXCoord();
            int y = getYCoord();
            things.add(new Thing("V", x, y, width, heigth));
        }
    }


    private int getXCoord() {
        return rand.nextInt(width);
    }

    private int getYCoord() {
        return rand.nextInt(heigth);
    }


    void run() {
        while (life > 0) {
            System.out.println(life);
            printListThings();
            System.out.println();
            //printMap();
            System.out.println();
            playerMoves();
            if (move)
                vampireMoves();
            life--;
        }
    }

    private void printListThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    private void printMap() {
        for (int x = 0; x < heigth; x++) {
            for (int y = 0; y < width; y++) {
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

    //  a-<  w-V  s-^  d->
    public String calcVampireMove(Thing thing) {
        String move1;
        int rnd = rand.nextInt(4);  // 4 directions
        if (rnd == 0) {
            move1 = "a";
        } else if (rnd == 1) {
            move1 = "w";
        } else if (rnd == 2) {
            move1 = "s";
        } else  { // if (rnd == 3) {
            move1 = "d";
        }
        return move1;
    }

    private String playerMoves() {
        String moves;
        System.out.print("moves (awsd): "); // ***
        moves = reader.nextLine();
        moves = "dsd"; //***************
        things.get(0).move(moves);
        return moves;
    }
    

}
