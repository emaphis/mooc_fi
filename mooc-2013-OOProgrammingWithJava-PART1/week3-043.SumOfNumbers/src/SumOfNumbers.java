public class SumOfNumbers {

    public static int sum(int number1, int number2, int number3, int number4) {
        int ret = number1 + number2 + number3 + number4;
        return ret;
    }

    public static void main(String[] args) {
        int answer = sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);
    }
}
