package ClassManager;

/**
 * Created by mattwu on 5/4/17.
 */
import java.util.ArrayList;


public class Inventory {

    private ArrayList<Product> inventoryList; //filed


    public Inventory() {

        inventoryList = new ArrayList<Product>();
    }


    public ArrayList<Product> getInventoryList() {

        return inventoryList;
    }


    public int size(){

        return inventoryList.size();
    }


    public void addProduct(Product p) {

        inventoryList.add(p);
    }


    public void removeProduct(int expectedID) {

        for (int i = 0; i < inventoryList.size(); i++) {

           int foundID = inventoryList.get(i).getID();

            if (foundID == expectedID) {

                inventoryList.remove(inventoryList.get(i));
                break;

            }
        }
    }


    public double getSumOfProducts() {

        double sum = 0.0;

        for (Product e: inventoryList) {

            sum += (e.getPrice() * e.getQuantity());

        }
        return sum;
    }

}

