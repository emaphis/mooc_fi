
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SkiJumpUI {
    private final Scanner reader;
    private final List<SkiJumper> jumpers;
    private final SkiJump judges;

    public SkiJumpUI() {
        this.reader = new Scanner(System.in);
        this.jumpers = new ArrayList<SkiJumper>();
        this.judges = new SkiJump();
    }

    public void start() {
        System.out.println("Kumpula ski jumping week\n");
        getSkiJumpers();
        handleJumps();
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
                System.out.println("/nRound " + round + "\n");
                round++;
                printJumpingOrder();
                System.out.println();
                jump(round);
                printResults();
            }
        }
    }

    private void printJumpingOrder() {
        int num = 1;
        for (SkiJumper jumper : jumpers) {
            System.out.println("  " + num + ". "  + jumper);
            num++;
        }
    }

    private void doJumps(int round) {
        for (SkiJumper jumper : jumpers) {
            SkiJump jump = new SkiJump(round);
            jumper.addJump(jump);
        }
    }

}
