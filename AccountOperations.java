package oopsdemo3;

//Main class to perform transactions on savings or checking account
public class AccountOperations {

    public static void main(String[] args)
    {
        //Upcasting
        Account account =new SavingsAccount("John",5000,4);

        System.out.println("\nSavings Account Details");
        System.out.println("------------------------");
        System.out.println("" + account.getName()
                + " has an initial Balance of: " + account.getBalance());
        account.deposit(2000);
        account.withdraw(3000);// invokes base class methods
        System.out.println("" + account.getName()
                + " at the end of transaction has a Balance of: "
                + account.getBalance());

        //Upcasting
        account =new CheckingAccount("Navin Kumar",10000.00,5000);

        System.out.println("\nChecking Account Details");
        System.out.println("-------------------------------");

        System.out.println("" + account.getName()
                + " has an initial Balance of: " + account.getBalance());
        account.deposit(2000);
        account.withdraw(15000); // // invokes overridden method of derived class
        System.out.println("" + account.getName()
                + " at the end of transaction has a Balance of: "
                + account.getBalance());
    }
}
