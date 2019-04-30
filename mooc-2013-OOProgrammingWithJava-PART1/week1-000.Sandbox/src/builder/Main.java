
package builder;


public class Main {

    static void testVariableArguments() {
        VariableParameters parameters = new VariableParameters();
        System.out.println(parameters.sum(3, 5, 7, 9));
        System.out.println(parameters.sum(1, 2));
    }

    public static void main(String[] args) {
        testVariableArguments();
    }

}
