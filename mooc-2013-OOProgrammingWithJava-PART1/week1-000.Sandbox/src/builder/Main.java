
package builder;


public class Main {

    static void testVariableArguments() {
        VariableParameters parameters = new VariableParameters();
        System.out.println(parameters.sum(3, 5, 7, 9));
        System.out.println(parameters.sum(1, 2));
    }

    public static String build(int... t) {
        String str = "{";

        for (int i = 0; i < t.length; i++) {
            str += t[i];
            if (i != t.length - 1) {
                str += ", ";
            }
        }

        return str + "}";
    }

    public static String builder(int... t) {
        StringBuilder str = new StringBuilder("{");

        for (int i = 0; i < t.length; i++) {
            str.append(t[i]);
            if (i != t.length - 1) {
                str.append(", ");
            }
        }

        return str.append("}").toString();
    }

    static void testBuilder() {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
        System.out.println(builder(t));
    }


    public static void main(String[] args) {
        testVariableArguments();
        testBuilder();
    }

}
