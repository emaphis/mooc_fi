
public class Main {

    public static void main(String[] args) {

        Dice dice = new Dice(6);

        int i = 0;
        while (i < 100) {
            System.out.println(dice.roll());
            i++;
        }

    }
}
