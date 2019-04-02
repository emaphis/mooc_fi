
package tools;

import java.util.HashSet;
import java.util.Set;


public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> set;
    private int numDuplicates;

    public PersonalDuplicateRemover() {
        this.set = new HashSet<String>();
        this.numDuplicates = 0;
    }


    @Override
    public void add(String characterString) {
        if (set.contains(characterString)) {
            numDuplicates++;
        } else {
            set.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return numDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return set;
    }

    @Override
    public void empty() {
        set.clear();
        numDuplicates = 0;
    }

}
