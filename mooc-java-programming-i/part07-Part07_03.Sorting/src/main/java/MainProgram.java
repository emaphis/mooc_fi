
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println("small: " + smallest(array));
        System.out.println("index: " + indexOfSmallest(array));

        // indices:       0  1  2  3   4
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        int[] numbers2 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 1, 0);
        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 0, 3);
        System.out.println(Arrays.toString(numbers2));

        System.out.println();
        int[] numbers3 = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers3);
        System.out.println(Arrays.toString(numbers3));
    }

    public static int smallest(int[] array) {
        int small = array[0];
        for (int i : array) {
            if (i < small) {
                small = i;
            }
        }
        return small;
    }

    public static int indexOfSmallest(int[] array) {
        int small = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == small) {
                return i;
            }
        }
        return 0;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int small = table[startIndex];
        int index = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < small) {
                small = table[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int index = 0;
//        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            index = indexOfSmallestFrom(array, i);
            swap(array, i, index);
 //           System.out.println(Arrays.toString(array));
        }

    }
}
