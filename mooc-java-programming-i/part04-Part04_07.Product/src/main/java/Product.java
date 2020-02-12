
public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String nameAlbum, double priceAlbum, int rateAlbum) {
        this.price = priceAlbum;
        this.quantity = rateAlbum;
        this.name = nameAlbum;
    }

    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    }

}
