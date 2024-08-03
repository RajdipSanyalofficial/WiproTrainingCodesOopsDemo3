package oopsdemo3;

public class CheckingAccount extends Account{

    // class for checking account operations - it has extra features -OD
    private double overDraft; // Pre-sanctions Loan
    public CheckingAccount(String name, double balance,double overDraft) {
        super(name, balance);
        this.overDraft=overDraft;
    }

    //override withdraw method of Account class.Bcoz Implementation
    //of withdraw is different


    @Override
    public void withdraw(double amt) {
        System.out.println("Overdraft Amount: " + overDraft);
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawing: " + amt);
        } else if ((amt > balance) && (amt > (balance + overDraft))) {
            System.out.println("Sorry! You cannot withdraw");
        } else {
            double result = amt - balance;
            overDraft -= result;
            balance = 0;

            System.out.println("Withdrawing: " + amt);
            System.out.println("Current Overdraft Amount: "
                    + overDraft);
        }
    }
}
