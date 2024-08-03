/**
 * Upcasting and Overriding demo
 */

package oopsdemo3;

// class for SavingsAccount operations-It is same as the normal account
public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }
}
