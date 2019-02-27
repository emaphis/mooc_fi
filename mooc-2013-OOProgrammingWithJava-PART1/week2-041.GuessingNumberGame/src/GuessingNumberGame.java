
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        //System.out.println("drawn: " + numberDrawn);

        // program your solution here. Do not touch the above lines!
        int count = 0;
        while(true) {
            System.out.print("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
            count++;

            if (guess > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + count);
            } else if (guess < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + count);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
