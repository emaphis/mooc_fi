
package enums;

import java.util.Arrays;
import java.util.List;


public class Continue {

    static void skipArto() {
        List<String> names = Arrays.asList("Matti", "Pekka", "Arto");

        for(String name: names) {
            if (name.equals("Arto")) {
                continue;
            }

            System.out.println(name);
        }
    }

    /**
     *  If the number is smaller than 5 and contains 100, or if it contains 40,
     *  it is not printed; otherwise it is.
     */
    static void filterNumbers() {
        List<Integer> values = Arrays.asList(1, 3, 11, 6, 120);

        for(int num: values) {
            if (num > 4 && num % 100 != 0 && num % 40 != 0) {
                System.out.println(num);
            }
        }

        for(int num: values) {
            if (num < 5) {
                continue;
            }

            if (num % 100 == 0) {
                continue;
            }

            if (num % 40 == 0) {
                continue;
            }

            System.out.println(num);
        }
    }


    public static void main(String[] args) {
        //skipArto();
        filterNumbers();
    }

}
