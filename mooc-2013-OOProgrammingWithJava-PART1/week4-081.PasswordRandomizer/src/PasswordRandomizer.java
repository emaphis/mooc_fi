import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private final Random random;
    private final int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        int count = 0;
        String symbols = "abcdefghijklmnopqrstuvwxyz";
        String passWord = "";
        while (count < length) {
            int number = random.nextInt(symbols.length());
            char symbol = symbols.charAt(number);
            passWord += symbol;
            count++;
        }
        return passWord;
    }
}
