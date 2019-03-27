
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Storehouse() {
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        if (prices.containsKey(product))
            return prices.get(product);
        else
            return -99;
    }

    public int stock(String product) {
        if (stocks.containsKey(product)) {
            return stocks.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if (stocks.containsKey(product)) {
            int stock = stocks.get(product);
            if (stock >= 1) {
                stock--;
                stocks.put(product, stock);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Set<String> products() {
        return prices.keySet();
    }
}
