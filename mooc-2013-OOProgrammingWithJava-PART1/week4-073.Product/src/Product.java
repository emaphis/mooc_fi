/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emaphis
 */
public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        name = nameAtStart;
        price = priceAtStart;
        amount = amountAtStart;
    }

    public void printProduct() {
        System.out.println(name + ", price " + price + ", amount " + amount);
    }
}
