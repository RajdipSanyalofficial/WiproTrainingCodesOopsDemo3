/**
 *
 */


package oopsdemo3;

public class Addition {

//overload add() method

    public void add()
    {
        System.out.println("********** Method Overloading Demo *****************");

    }

    public void add (int a,int b)
    {
        System.out.println("The addition of 2 integer number is :"+(a+b));
    }

    public void add (double a,double  b)
    {
        System.out.println("The addition of 2 double  number is :"+(a+b));
    }

    public void add (double a,int  b)
    {
        System.out.println("The addition of 1 double and 1 integer number is :"+(a+b));
    }

    public void add (int a,int b,int c)
    {
        System.out.println("The addition of 3 1 integer number is :"+(a+b+c));
    }

    public void add (String a, String b)
    {
        System.out.println("The addition of 2 string is :"+(a+b));
    }



}
