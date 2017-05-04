package ClassManager;

/**
 * Created by mattwu on 5/4/17.
 */
public class Product {

    private int id;
    private double price;
    private int quantity;

    public Product() {}

    public Product(int aID, double aPrice, int aQuantity) {

        id = aID;
        price  = aPrice;
        quantity = aQuantity;
    }

    public int getID() {

        return id;
    }

    public double getPrice() {

        return price;
    }

    public int getQuantity() {

        return quantity;
    }

}

