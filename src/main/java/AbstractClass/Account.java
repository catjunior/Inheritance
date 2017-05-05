package AbstractClass;

/**
 * Created by mattwu on 5/4/17.
 */
public abstract class Account {

    private String accOwner;
    private String accType;
    private double accBalance;
    private double credit;
    private int years;

    public Account (){}

    public Account (String name, String type, double balance, double credit) {

        accOwner = name;
        accType = type;
        accBalance = balance;
        this.credit = credit;
    }


    public String getOwner() {
        return accOwner;
    }

    public String getAccType() {
        return accType;
    }

    public double getBalance(){
        return accBalance;
    }

    public double getCredit(){
        return this.credit;
    }


    public double deposit(double credit) {
        accBalance += credit;
        return accBalance;
    }

    public double withDraw(double credit) {
        accBalance -= credit;
        return accBalance;
    }

    public abstract double growthInYears(double accBalance, double interestRate, int years);



}
