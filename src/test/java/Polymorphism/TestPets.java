package Polymorphism;

import Polymorphsim.Pets;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mattwu on 5/19/17.
 */
public class TestPets {

    @Test
    public void testPetSpeak() {

        //Given
        String expected = "I am a pet";
        Pets pet = new Pets();

        //When
        String  actual= pet.speak();

        //Then
        Assert.assertEquals(expected, actual);

    }

}
