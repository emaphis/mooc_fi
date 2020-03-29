
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author emaphis
 */
public class Warehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> balances;

    public Warehouse() {
        this.products = new HashMap<>();
        this.balances = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        balances.put(product, stock);
    }

    public int price(String product) {
        return products.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return balances.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        int stock = balances.getOrDefault(product, 0);
        if (stock == 0) {
            return false;
        }
        stock--;
        balances.put(product, stock);
        return true;
    }

    public Set<String> products() {
        return products.keySet();
    }
}
