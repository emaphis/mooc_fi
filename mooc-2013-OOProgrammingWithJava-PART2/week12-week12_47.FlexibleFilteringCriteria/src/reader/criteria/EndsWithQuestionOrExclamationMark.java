
package reader.criteria;


public class EndsWithQuestionOrExclamationMark implements Criterion {

    public EndsWithQuestionOrExclamationMark() {
    }

    @Override
    public boolean complies(String line) {
        if (line.isEmpty())
            return false;

        char end = line.charAt(line.length() - 1);
        return end == '!' || end == '?';
    }

}
