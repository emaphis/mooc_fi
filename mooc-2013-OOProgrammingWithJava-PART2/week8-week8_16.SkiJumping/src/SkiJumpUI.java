
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class SkiJumpUI {
    private final Scanner reader;
    private final List<SkiJumper> jumpers;

    public SkiJumpUI() {
        this.reader = new Scanner(System.in);
        this.jumpers = new ArrayList<SkiJumper>();
    }

    public void start() {
        System.out.println("Kumpula ski jumping week\n");
        getSkiJumpers();
        handleJumps();
        printTotals();
    }

    private void getSkiJumpers() {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        String name;
        while(true) {
            System.out.print("  Participant name: ");
            name = reader.nextLine();
            if (name.isEmpty())
                break;
            SkiJumper jumper = new SkiJumper(name);
            jumpers.add(jumper);
        }
        System.out.println();
    }

    private void handleJumps() {
        System.out.println("The tournament begins!\n");
        String entry;
        int round = 1;
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            entry = reader.nextLine();
            if (entry.equals("quit")) {
                System.out.println();
                  System.out.println("Thanks!");
                break;
            }
            if (entry.equals("jump")) {
                System.out.println("\nRound " + round + "\n");
                printJumpingOrder();
                System.out.println();
                doJumps(round);
                round++;
            }
        }
    }

    private void printJumpingOrder() {
        int num = 1;
        System.out.println("Jumping order:");
        for (SkiJumper jumper : jumpers) {
            System.out.println("  " + num + ". "  + jumper);
            num++;
        }
    }

    private void doJumps(int round) {
        System.out.println("Results of round " + round);
        for (SkiJumper jumper : jumpers) {
            SkiJump jump = new SkiJump(round);
            jump.jump();
            jumper.addJump(jump);
            System.out.println("  " + jumper.getName());
            System.out.println("    length: " + jump.getLength());
            System.out.print("    judge votes: ");
            jump.printScores();
            System.out.println();
        }
    }

    private void printTotals() {
        System.out.println();
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        int num = 1;
        Collections.sort(jumpers);
        for (SkiJumper jumper : jumpers) {
            System.out.print(num + "           ");
            System.out.println(jumper);
            System.out.print("             jump lengths: ");
            List<Integer> jumps = jumper.getJumps();
            for (Integer jump : jumps) {
                if (num < jumps.size()-1) {
                    System.out.print(jump + "m, ");
                } else {
                    System.out.print(jump + "m ");
                }
            }
            System.out.println();
            num++;
        }
        System.out.println();
    }

}
