/**
 * Upcasting and Overriding demo
 */

package oopsdemo3;

public class Account {

    private String name;
    protected double balance;

    //Generate Constructors

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    //Generate only Getters

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    //final methods cannot be overridden
    final void deposit(double amt){
        balance+=amt;
        System.out.println("Depositing : "+amt);
    }
    public void withdraw(double amt){
        balance-=amt;
        System.out.println("Withdrawing :"+amt);
    }
}
