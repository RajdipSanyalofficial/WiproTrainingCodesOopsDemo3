/**
 * Dynamic Polymorphism - Upcasting Demo
 */

package oopsdemo3;

public class Item {

    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void display()
    {
        System.out.println("************ Item Details ************");
        System.out.println("name :"+name);
        System.out.println("price :"+price);
    }
}
