/**
 * Method Overriding demo
 */

package oopsdemo3;

public class ElectronicsProducts extends Product {

    private String brand;
    private String model;

    public ElectronicsProducts(String name, double price,String brand,String model) {
        super(name, price);
        this.brand=brand;
        this.model=model;
    }

    //Override displayDetails() method

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand   : "+brand);
        System.out.println("Model   : "+model);
        System.out.println("Warranty: 1 Year");
    }
}
