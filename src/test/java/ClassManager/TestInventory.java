package ClassManager;

/**
 * Created by mattwu on 5/3/17.
 * Test Product
 */

import org.junit.*;
import static org.junit.Assert.*;


public class TestInventory {

    Inventory inventoryList;

    @Before
    public void startup() { inventoryList = new Inventory(); }



        @Test
        public void testAddToInventory() {

            //given
            Product vwJetta = new Product(001, 20000, 1);

            int currentSize = inventoryList.size();
            int expectedSize = currentSize + 1;

            // When
            inventoryList.addProduct(vwJetta);
            int actualSize = inventoryList.size();


                    // Then
            assertEquals(expectedSize, actualSize, 0);

        }


        @Test
        public void testRemoveFromInventory(){

            //given
            inventoryList.addProduct(new Product(002, 20000, 1));
            inventoryList.addProduct(new Product(003, 25000, 1));

            // When
            inventoryList.removeProduct(002);
            int actualSize = inventoryList.size();

            // Then
            assertEquals(1, actualSize, 0);

        }

        @Test
        public void testGetSumOfProducts() {
            // Given
            inventoryList.addProduct(new Product(001, 20000, 1));
            inventoryList.addProduct(new Product(002, 25000, 1));

            double expected = 45000;

            // When
            double actual = inventoryList.getSumOfProducts();

            // Then
            assertEquals(expected, actual, 0);
        }
}




