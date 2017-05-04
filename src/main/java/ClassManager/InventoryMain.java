package ClassManager;

/**
 * Created by mattwu on 5/3/17.
 */
public class InventoryMain {

    public static void main(String[] args) {

        Product vwJetta = new Product(001, 20000, 1);
        Product vwPassat = new Product( 002, 25000, 1);

        Inventory inventoryList = new Inventory();

        inventoryList.addProduct(vwJetta);
        inventoryList.addProduct(vwPassat);

        System.out.println("Added two new car...");
        System.out.println("Current inventory value: " + inventoryList.getSumOfProducts() );

        inventoryList.removeProduct(002);
        System.out.println("Rmoved one Passat...");
        System.out.println("Current inventory value: " + inventoryList.getSumOfProducts() );

    }
}
