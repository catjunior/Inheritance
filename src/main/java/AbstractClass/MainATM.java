package AbstractClass;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

/**
 * Created by mattwu on 5/4/17.
 */
public class MainATM {

    public static void main(String[] args) {

        CheckingAccount matt = new CheckingAccount ("Checking", "Matt", 1000, 0);

        System.out.println( "Your current balance: " + matt.getBalance() );

        System.out.println( "Your new balance: " + matt.deposit(300));

        System.out.println( "Potential growing to: " + matt.growthInYears( matt.getBalance(), matt.getInterestRate(), 3 ) );
    }

}
