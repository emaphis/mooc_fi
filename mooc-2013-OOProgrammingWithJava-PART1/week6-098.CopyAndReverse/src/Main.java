
import java.util.Arrays;



public class Main {

    public static int[] copy(int[] array) {
        int[] intArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            intArray[i] = array[i];
        }
 
        return intArray;
    }

    public static int[] reverseCopy(int[] array) {
        int[] intArray = new int[array.length];
 
        for (int i = array.length - 1; i >= 0; i--) {
            intArray[array.length - i - 1] = array[i];
        }
 
        return intArray;
    }


    public static void testCopy() {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print boths
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
    }

    public static void testReverseCopy() {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
        }


    public static void main(String[] args) {
        // write testcode here
        //testCopy();
        testReverseCopy();
    }
    
}
