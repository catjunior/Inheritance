package AbstractClass;

/**
 * Created by mattwu on 5/4/17.
 */
public class SavingAccount extends Account {

    private double savingInterestRate = 0.05;


    public SavingAccount(double currentBalance, double interestRate, int years){}

    public SavingAccount (String name, String type, double balance, double credit){

        super(name, type, balance, credit);
    }


    public double getInterestRate(){
        return savingInterestRate;
    }


    public double growthInYears(double accBalance, double interestRate, int years) {

        return accBalance * Math.pow( (1 + getInterestRate() ), years );
    }

}
