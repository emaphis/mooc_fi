
public class Program {

    public static void main(String[] args) {
        // Test your method here
        test1();
        System.out.println("vvvvvvvvvvv");
        test2();
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder builder = new StringBuilder();
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                int value = array[row][column];
                builder.append(value);
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    private static void test1() {
        int rows = 2;
        int cols = 3;
        int[][] matrix = new int[rows][cols];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
    }

    private static void test2() {
        int[][] matrix = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };
        System.out.println(arrayAsString(matrix));
    }
}
