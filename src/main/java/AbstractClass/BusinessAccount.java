package AbstractClass;

/**
 * Created by mattwu on 5/4/17.
 */
public class BusinessAccount extends Account {


    private double businessInterestRate = 0.1;


    public BusinessAccount (){}

    public BusinessAccount (String name, String type, double balance, double credit){

        super(name, type, balance, credit);
    }

    public double showPotentialEarning(double accBalance, double interestRate, int years) {
        return 0;
    }


    public double getInterestRate(){
        return businessInterestRate;
    }

    public double growthInYears(double accBalance, double interestRate, int years) {

        return accBalance * Math.pow( (1 + getInterestRate() ), years );
    }
}
