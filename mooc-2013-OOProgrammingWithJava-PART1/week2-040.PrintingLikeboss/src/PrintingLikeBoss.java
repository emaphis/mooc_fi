public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int count = 0;
        while (count < amount) {
            System.out.print("*");
            count++; 
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int count = 0;
        while (count < amount) {
            System.out.print(" ");
            count++; 
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int count = 1;
        while (count <= size) {
            printWhitespaces(size-count);
            printStars(count);
            count++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        // height is also width
        int count = 1;
        while (count <= height) {
            printWhitespaces(height - count);
            printStars(count + (count - 1));
            count++;
        }
        // print trunk - square
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
