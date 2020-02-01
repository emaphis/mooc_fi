
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int count = 0;
        while (count < number) {
            System.out.print("*");
            count++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int count = 0;
        while (count < number) {
            System.out.print(" ");
            count++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int count = 1;
        while (count <= size) {
            printSpaces(size - count);
            printStars(count);
            count++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int count = 1;
        while (count < height + 1) {
            printSpaces(height - count);
            printStars(count + (count - 1));
            count++;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
