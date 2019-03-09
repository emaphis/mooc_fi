import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();
        int num;
        System.out.println("Type numbers: ");
        while (true) {
            num = Integer.parseInt(reader.nextLine());
            if (num == -1)
                break;
            stats.addNumber(num);
            if (num % 2 == 0)
                evenStats.addNumber(num);
            else
                oddStats.addNumber(num);
        }
        //System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + evenStats.sum());
        System.out.println("sum of odd: " + oddStats.sum());
        //System.out.println("average: " + stats.average());
    }
}
