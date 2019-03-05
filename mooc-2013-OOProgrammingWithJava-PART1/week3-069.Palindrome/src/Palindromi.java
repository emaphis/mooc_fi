import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String reverse = reverse(text);
        return text.equals(reverse);
    }

    public static String reverse(String text) {
        String help = "";
        int len = text.length() - 1;
        while (len >= 0) {
            help += text.charAt(len);
            len--;
        }
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
