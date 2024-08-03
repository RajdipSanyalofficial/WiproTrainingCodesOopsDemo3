/**
 * Method Overriding demo2
 */

package oopsdemo3;

public class OverrideDemo2 {

    public static void main(String[] args)
    {
        ElectronicsProducts ep1=new ElectronicsProducts("Laptop",999.99,"Dell","Latitude");
        ClothingProduct cp1=new ClothingProduct("T-Shirt",15.50f,"Medium","Indigo");

        System.out.println("******** Electronics Product Details *************");
        ep1.displayDetails();//call to Overridden method

        System.out.println("******** Clothing Product Details *************");
        cp1.displayDetails();//call to Overridden method
    }
}
