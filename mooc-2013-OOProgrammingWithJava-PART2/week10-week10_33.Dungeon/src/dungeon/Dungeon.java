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
            int x = getXCoord();
            int y = getYCoord();
            things.add(new Thing("v", x, y, width, heigth));
        }
        //things.add(new Thing("A", 0, 0, width, heigth));
        //things.add(new Thing("B", 9, 0, width, heigth));
        //things.add(new Thing("C", 0, 9, width, heigth));
        //things.add(new Thing("D", 9, 9, width, heigth));
        //hings.add(new Thing("E", 5, 5, width, heigth));
    }

    private Thing testAddVamp(String glyph) {
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
            life--;
        }
        if (things.size() > 1)
            System.out.println("YOU LOSE");
        else
            System.out.println("YOU WIN!");
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
    public String calcVampireMove(Thing thing) {
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

    private String playerMoves() {
        String moves;
        moves = reader.nextLine();
       // moves = "s"; //**a-dx  d-u w-dy  s-iy
        things.get(0).move(moves);
        return moves;
    }
    

}
