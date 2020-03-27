
/**
 *
 * @author emaphis
 */
public class OneItemBox extends Box {
    private Item contents;

    public OneItemBox() {
        this.contents = null;  // create empty
    }

    @Override
    public void add(Item item) {
        if (contents == null) {
            contents = item;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (contents == null) {
            return false;
        }

        return contents.equals(item);
    }

    public Item getContents() {
        return contents;
    }

}
