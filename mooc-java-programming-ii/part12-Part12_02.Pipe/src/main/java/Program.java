
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you may try out your class here
        test1();
        test2();
    }

    private static void test1() {
        System.out.println("got here b");
        Pipe<String> pipe = new Pipe<>();
        pipe.putIntoPipe("dibi");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("daa");
        while (pipe.isInPipe()) {
            System.out.println(pipe.takeFromPipe());
        }
    }

    private static void test2() {
        System.out.println("got here c");
        Pipe<Integer> numberPipe = new Pipe<>();
        numberPipe.putIntoPipe(1);
        numberPipe.putIntoPipe(2);
        numberPipe.putIntoPipe(3);

        int sum = 0;
        while (numberPipe.isInPipe()) {
            sum = sum + numberPipe.takeFromPipe();
        }
        System.out.println(sum);
        System.out.println(numberPipe.takeFromPipe());
    }
}
