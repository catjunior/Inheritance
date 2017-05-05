package AbstractClass;

/**
 * Created by mattwu on 5/5/17.
 */

import org.junit.*;
import static org.junit.Assert.*;

public class TestSavingAccount {


    @Test
    public void testGrowthInYears(){
        //Given
        double accBalance = 3000;
        double interestRate = .05;
        int years = 2;
        double credit = 0;
        double expectedEarnings = accBalance * Math.pow( (1 + .05 ), 2 );

        SavingAccount account = new SavingAccount ("matt", "checking", accBalance, credit);

        //When
        double actualEarnings = account.growthInYears(accBalance, interestRate, years);

        //Then
        Assert.assertEquals(expectedEarnings, actualEarnings, 0);
    }

    @Test
    public void testDeposit () {
        //given
        double accBalance = 200;
        double credit = 300;

        double expectedBalance = accBalance + credit;

        CheckingAccount account = new CheckingAccount("matt", "checking", accBalance, credit);

        //when
        double actualBalance = account.deposit(credit);

        //Then
        Assert.assertEquals(expectedBalance, actualBalance, 0);
    }

    @Test
    public void testWithDraw() {
        //given
        double accBalance = 500;
        double credit = 300;

        double expectedBalance = accBalance - credit;

        SavingAccount account = new SavingAccount("matt", "checking", accBalance, credit);

        //when
        double actualBalance = account.deposit(credit);

        //Then
        Assert.assertEquals(expectedBalance, actualBalance, 0);

    }


}
