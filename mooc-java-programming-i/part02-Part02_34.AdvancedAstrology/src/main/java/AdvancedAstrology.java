
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
        System.out.println();
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

     //   printSpaces(1); System.out.println("-*-");
     //   System.out.println("ooo");
     //   printSpaces(3); System.out.println("-*-");
        printTriangle(4);
/*
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);*/
    }
}
