
/**
 *
 * @author emaphis
 */
public class Hideout<T> {
    private T item;

    public Hideout() {
        this.item = null;
    }

    public void putIntoHideout(T toHide) {
        item = toHide;
    }

    public T takeFromHideout() {
        T ret = null;
        if (isInHideout()) {
            ret = item;
            item = null;
        }
        return ret;
    }

    public boolean isInHideout() {
        return item != null;
    }
}
