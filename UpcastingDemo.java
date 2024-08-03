/**
 * Java Program to demonstrate Dynamic Polymorphism & UpCasting
 */

package oopsdemo3;

public class UpcastingDemo {

    public static void main(String[] args)
    {
        Item item;

        //Upcasting - Child object is referred Parent object
        item =new Book("Java Programming",599,"James Gosling");

        item.display(); // Dynamic Polymorphism

        //switch from one implementation to another because of type casting
        item=new Laptop("IPad",72000,"Lenovo");

        item =new Book("Python Programming",999,"Yeshwant Kanetkar");
        item.display(); // Dynamic Polymorphism
    }
}
