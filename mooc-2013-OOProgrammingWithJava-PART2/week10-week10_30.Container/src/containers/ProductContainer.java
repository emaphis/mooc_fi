
package containers;


public class ProductContainer extends Container {
    private String productName;

    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    public void setName(String name) {
        productName = name;
    }

    @Override
    public String toString() {
        return getName() + ": " + super.toString();
    }

}
