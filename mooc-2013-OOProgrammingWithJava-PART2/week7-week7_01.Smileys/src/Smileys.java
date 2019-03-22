
public class Smileys {
    private static String smiley = ":)";

    private static void printWithSmileys(String figure) {
        printBorder(figure);
        printFigureLine(figure);
        printBorder(figure);
    }

    private static void printFigureLine(String figure) {
        printSmiley();
        printFigure(figure);
        printSmiley();
        System.out.println();
    }
    
    // print a line of smilies 2 longer than the figureLenght
    private static void printBorder(String figure) {
        for (int i = 0; i < figure.length() + 6; i+=2) {
            printSmiley();
        }
        System.out.println();
    }

    // print the figure add a space if the figure is odd length
    public static void printFigure(String figure) {
        System.out.print(" " + figure + " ");
        if (figure.length() % 2 == 1) {
            System.out.print(" ");
        }
    } 

    private static void printSmiley() {
        System.out.print(smiley);
    }


    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("\\:D/");
        printWithSmileys("87.");
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

}
