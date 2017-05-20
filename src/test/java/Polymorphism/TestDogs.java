package Polymorphism;

import Polymorphsim.Dogs;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mattwu on 5/19/17.
 */
public class TestDogs {

    @Test
    public void testCatSpeak() {

        //Given
        String expected = "Woof";
        Dogs dog = new Dogs();

        //When
        String  actual= dog.speak();

        //Then
        Assert.assertEquals(expected, actual);

    }

}
