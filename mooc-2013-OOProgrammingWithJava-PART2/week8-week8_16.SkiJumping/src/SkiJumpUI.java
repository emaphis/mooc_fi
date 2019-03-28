
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class SkiJumpUI {
    private final Scanner reader;
    private final List<SkiJumper> jumpers;
//    private final SkiJump judges;

    public SkiJumpUI() {
        this.reader = new Scanner(System.in);
        this.jumpers = new ArrayList<SkiJumper>();
  //      this.judges = new SkiJump();
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
            if (entry.equals("quit"))
                break;
            if (entry.equals("jump")) {
                System.out.println("\nRound " + round + "\n");
                printJumpingOrder();
                System.out.println();
                doJumps(round);
                printResults(round);
                round++;
            }
        }
    }

    private void printJumpingOrder() {
        int num = 1;
        System.out.println("Jumping order:");
        for (SkiJumper jumper : jumpers) {
            if (jumper == null) {
                System.out.println("  ***, ****");
            }
            System.out.println("  " + num + ". "  + jumper);
            num++;
        }
    }

    private void doJumps(int round) {
        for (SkiJumper jumper : jumpers) {
            SkiJump jump = new SkiJump(round);
            jump.jump();
            jumper.addJump(round, jump);
        }
    }

    private void printResults(int round) {
        System.out.println("Results of round " + round);
        for (SkiJumper jumper : jumpers) {
            System.out.println("  " + jumper.getName());
            SkiJump jump = jumper.getJump(round);
            System.out.println("    length: " + jump.getLength());
            System.out.print("    judge votes: ");
            jump.printScores();
        }
    }

    private void printTotals() {
        System.out.println();
        System.out.println("Thanks!");
        System.out.println();
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        int num = 1;
        for (SkiJumper jumper : jumpers) {
            System.out.print(num + "           ");
            System.out.println(jumper);
            System.out.print("             jump lengths: ");
            List<SkiJump> jumps = jumper.getJumps();
            Collections.sort(jumps);
            for (int i = 0; i < jumps.size() - 1; i++) {
                System.out.print(jumps.get(i).getLength() + " m, ");
            }
            System.out.println(jumps.get(jumps.size() - 1).getLength() + " m");
            
        }
    }

}
