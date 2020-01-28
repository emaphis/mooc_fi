
public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        //System.out.println("Hello, Sandbox!");
        int number = 0;

    while (true) {
        number = number + 1;

        if (number >= 5) {
            break;
        }

        if (number < 5) {
            continue;
        }

        System.out.print(number + " ");
    }

    System.out.print(number + " ");
}
}
