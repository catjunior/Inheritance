package ClassManager;

/**
 * Created by mattwu on 5/3/17.
 */
public class InventoryMain {

    public static void main(String[] args) {

        //create 2 cars
        Product vwJetta = new Product(001, 20000, 1);
        Product vwPassat = new Product( 002, 25000, 1);

        Inventory inventoryList = new Inventory();

        //add 2 created cars into inventoryList
        inventoryList.addProduct(vwJetta);
        inventoryList.addProduct(vwPassat);

        System.out.println("Added two new car...");


        //get total value of inventories
        System.out.println("Current inventory value: " + inventoryList.getSumOfProducts() );

        //remove car'id: 002' from inventory
        inventoryList.removeProduct(002);
        System.out.println("Rmoved one Passat...");

        System.out.println("Current inventory value: " + inventoryList.getSumOfProducts() );

    }
}
