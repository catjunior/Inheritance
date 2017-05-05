package AbstractClass;

/**
 * Created by mattwu on 5/5/17.
 */

import org.junit.*;
import static org.junit.Assert.*;

public class TestAccount {

    Account accout;

    @Before
    public void startup() { account = new Account(); }

    @Test

    public void growthInYearsForChecking(){
        //Given
        double currentBalance = 3000;
        double interestRate = .01;
        int years = 2;
        double expectedEarnings = currentBalance * Math.pow( (1 + getInterestRate() ), years );

        CheckingAccount checkingAccount = new CheckingAccount (currentBalance, interestRate, years);

        //When
        double actualEarnings = checkingAccount.growthInYears(currentBalance, interestRate, years);

        //Then
        Assert.assertEquals(expectedEarnings, actualEarnings, 0);
    }

    @Test

    public void growthInYearsForSaving(){
        //Given
        double currentBalance = 3000;
        double interestRate = .05;
        int years = 2;
        double expectedEarnings = currentBalance * Math.pow( (1 + getInterestRate() ), years );

        SavingAccount savingAccount = new SavingAccount(currentBalance, interestRate);

        //When
        double actualEarnings = savingAccount.growthInYears(currentBalance, interestRate);

        //Then
        Assert.assertEquals(expectedEarnings, actualEarnings, 0);
    }

    @Test
    public void growthInYearsForBusiness(){
        //Given
        double currentBalance = 1000;
        double interestRate = .10;
        int years = 2;
        double expectedEarnings = currentBalance * Math.pow( (1 + getInterestRate() ), years );

        BusinessAccount businessAccount = new BusinessAccount(currentBalance, interestRate);

        //When
        double actualEarnings = businessAccount.growthInYears(currentBalance, interestRate);

        //Then
        Assert.assertEquals(expectedEarnings, actualEarnings, 0);
    }


}
