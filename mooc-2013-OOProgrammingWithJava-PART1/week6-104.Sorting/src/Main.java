
import java.util.Arrays;


public class Main {

    public static int smallest(int[] array) {
        int small = array[0];

        for (int i = 0; i < array.length; i++) {
            if (small > array[i]) {
                small = array[i];
            }
        }

        return small;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index  = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[index] > array[i]) {
                index = i;
            }
        }

        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int ind  = index;

        for (int i = index; i < array.length; i++) {
            if (array[ind] > array[i]) {
                ind = i;
            }
        }

        return ind;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int cmp = indexOfTheSmallestStartingFrom(array, i);
            if (array[i] > array[cmp]) {
                swap(array, i, cmp);
                //System.out.println(Arrays.toString(array));
            }
        }
    }

    public static void testSmallest() {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));
    }

    public static void testIndex() {
        // indexes:     0  1  2  3  4
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
    }

    public static void testStartIndex() {
        // indexes:      0  1  2  3   4
        int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
    }

    public static void TestSwap() {
        int[] values = {3, 2, 5, 4, 8};

        System.out.println( Arrays.toString(values) );

        swap(values, 1, 0);
        System.out.println( Arrays.toString(values) );

        swap(values, 0, 3);
        System.out.println( Arrays.toString(values) );
    }

    public static void testSort() {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }


    public static void main(String[] args) {
        // write testcode here
        //testSmallest();
        //testIndex();
        //testStartIndex();
        //TestSwap();
        testSort();
    }

}
