
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        if (size % 2 == 0) throw new RuntimeException("size must be odd");

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int newNumber = 1;
        //int lastNumber = size * size;

        int y = 0;
        int x = (size - 1) / 2;
        square.placeValue(x, y, newNumber);
        newNumber++;
        while (newNumber <= size * size) {
            int[] newCoord = nextUnit(square, x, y);
            x = newCoord[0];
            y = newCoord[1];
            square.placeValue(x, y, newNumber);
            newNumber++;
        }

        return square;
    }

    private int[] nextUnit(MagicSquare square, int x, int y) {
        int nextY = (y - 1 + square.getHeight()) % square.getHeight();
        int nextX = (x + 1) % square.getWidth();
        if (square.readValue(nextX, nextY) == 0) {
            return new int[] {nextX, nextY};
        } else {
            y = (y + 1) % square.getWidth();
            return new int[] {x, y};
        }
    }
}
