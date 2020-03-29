
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        // Part 1
        TripleTacoBox box = new TripleTacoBox();
        eat5(box);
        System.out.println("ooooooo");
        // part 2
        CustomTacoBox cbox = new CustomTacoBox(4);
        eat5(cbox);
    }

    // generic on TacoBox
    static void eatAndDisplay(TacoBox box) {
        box.eat();
        if (box.tacosRemaining() > 0) {
            System.out.println("eat !");
        } else {
            System.out.println("No more !");
        }
    }

    private static void eat5(TacoBox box) {
        eatAndDisplay(box);
        eatAndDisplay(box);
        eatAndDisplay(box);
        eatAndDisplay(box);
        eatAndDisplay(box);
    }
}
