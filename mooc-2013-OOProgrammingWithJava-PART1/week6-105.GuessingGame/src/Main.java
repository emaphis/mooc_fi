
public class Main {

    public static void testGreater() {
        GuessingGame game = new GuessingGame();
        System.out.println(game.isGreaterThan(32));
    }

    public static void testAverage() {
        GuessingGame game = new GuessingGame();

        System.out.println("3, 4 " + game.average(3, 4));
        System.out.println("6, 12 " + game.average(6, 12));
    }

    public static void testGame() {
        GuessingGame game = new GuessingGame();
        game.play(1,10);
    }

    public static void main(String[] args) {
        // test your program here
        //testGreater();
        //testAverage();
        testGame();
    }    
}
