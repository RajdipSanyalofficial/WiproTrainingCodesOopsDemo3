/**
 * Method Overriding demo
 */

package oopsdemo3;

public class ClothingProduct extends Product {

    private String size;
    private String color;

    public ClothingProduct(String name, double price,String size,String color) {
        super(name, price);
        this.size=size;
        this.color=color;
    }

    //override displayDetails() method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size   : "+size);
        System.out.println("Color  : "+color);
        System.out.println("Material: Cotton");
    }
}
