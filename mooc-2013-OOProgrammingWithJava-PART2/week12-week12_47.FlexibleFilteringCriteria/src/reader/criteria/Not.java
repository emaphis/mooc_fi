
package reader.criteria;


public class Not implements Criterion {
    private final Criterion crit;

    public Not(Criterion crit) {
        this.crit = crit;
    }

    @Override
    public boolean complies(String line) {
        return !crit.complies(line);
    }

}
