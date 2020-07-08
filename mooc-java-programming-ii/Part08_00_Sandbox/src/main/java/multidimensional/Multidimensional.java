
package multidimensional;

/**
 *
 * @author emaphis
 */
public class Multidimensional {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        int rows = 2;
        int columns = 3;
        int[][] twoDimensialArray = new int[rows][columns];

        twoDimensialArray[0][1] = 4;
        twoDimensialArray[1][1] = 1;
        twoDimensialArray[1][0] = 8;

        System.out.println("row, column, value");
        for (int row = 0; row < twoDimensialArray.length; row++) {
            for (int column = 0; column < twoDimensialArray[row].length; column++) {
                int value = twoDimensialArray[row][column];
                System.out.println(" " + row + ", " + column + ", " + value);
            }
        }
    }

}
