package Polymorphism;

import Polymorphsim.Birds;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mattwu on 5/19/17.
 */
public class TestBirds {

    @Test
    public void testCatSpeak() {

        //Given
        String expected = "EeeeHaaa";
        Birds bird = new Birds();

        //When
        String  actual= bird.speak();

        //Then
        Assert.assertEquals(expected, actual);

    }

}
