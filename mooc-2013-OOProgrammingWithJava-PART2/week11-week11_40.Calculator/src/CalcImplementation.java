
/**
 * Implementation of the Calculator
 * @author emaphis
 */
public class CalcImplementation {
    private Integer register;

    public CalcImplementation() {
        this.register = 0;
    }

    public Integer getValue() {
        return register;
    } 

    public Integer add(Integer value) {
        register += value;
        return register;
    }

    public Integer sub(Integer value) {
        register -= value;
        return register;
    }

    public void reset() {
        register = 0;
    }

}
