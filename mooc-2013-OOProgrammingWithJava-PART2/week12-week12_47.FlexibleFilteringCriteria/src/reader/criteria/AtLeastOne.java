
package reader.criteria;

import java.util.ArrayList;
import java.util.List;


public class AtLeastOne implements Criterion {
    private final Criterion[] criteria;

    public AtLeastOne(Criterion... criteria) {
        this.criteria = criteria;
    }

    @Override
    public boolean complies(String line) {
        for (Criterion criterion : criteria) {
            if (criterion.complies(line))
                return true;
        }
        return false;
    }

}
