/**
 *
 * Overriding is a feature that allows a subclass or
 * child class to provide a specific implementation of a method
 *  that is already provided by one of its super-classes or parent classes.
 */


package oopsdemo3;

class Bank
{
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    int getRateOfInterest()
    {
        return 0;
    }

    void display()
    {
        System.out.println("Welcome to "+name+" Bank");
    }
}

class SBI extends Bank{

    public SBI(String name) {
        super(name);
    }

    // method overriding
    int getRateOfInterest()
    {
        return 5;
    }


}



class Axis extends Bank
{

    public Axis(String name) {
        super(name);
    }

    // method overriding -> method name is same but implementation is different
    int getRateOfInterest()
    {
        return 6;
    }
}


class ICICI extends Bank
{

    public ICICI(String name) {
        super(name);
    }

    // method overriding -> method name is same but implementation is different
    int getRateOfInterest()
    {
        return 7;
    }
}

public class OverrideDemo1 {

    public static void main(String[] args)
    {

        SBI sbiBank=new SBI("SBI");
        Axis axisBank=new Axis("Axis");
        ICICI iciciBank=new ICICI("ICICI");


        sbiBank.display();
        //Invoke overridden methods
        System.out.println("The Interest Rate of SBI is :"+sbiBank.getRateOfInterest());

        sbiBank.display();
        System.out.println("The Interest Rate of ICICI is :"+iciciBank.getRateOfInterest());

        sbiBank.display();
        System.out.println("The Interest Rate of Axis is :"+axisBank.getRateOfInterest());
    }


}
