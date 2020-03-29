
/**
 *
 * @author emaphis
 */
public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String produce, int qty, int unitPrice) {
        this.product = produce;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return unitPrice * qty;
    }

    public void increaseQuantity() {
        qty++;
    }

    @Override
    public String toString() {
        return product + ": " + qty;
    }
}
