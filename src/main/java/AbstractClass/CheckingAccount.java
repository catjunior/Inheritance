package AbstractClass;

/**
 * Created by mattwu on 5/4/17.
 */
public class CheckingAccount extends Account {

    private double checkingInterestRate = 0.01;




    public CheckingAccount (){}

    public CheckingAccount (String name, String type, double balance, double credit){

        super(name, type, balance, credit);
    }

    public double getInterestRate(){
        return checkingInterestRate;
    }


    public double growthInYears(double accBalance, double interestRate, int years){

        return accBalance * Math.pow( (1 + getInterestRate() ), years );
    }

}
