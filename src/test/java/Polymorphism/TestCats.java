package Polymorphism;

import Polymorphsim.Cats;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mattwu on 5/19/17.
 */
public class TestCats {

    @Test
    public void testCatSpeak() {

        //Given
        String expected = "Meeooow";
        Cats cat = new Cats();

        //When
        String  actual= cat.speak();

        //Then
        Assert.assertEquals(expected, actual);

    }

}
