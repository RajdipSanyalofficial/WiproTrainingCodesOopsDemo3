/**
 * Java Program to manage products in a outlet using method overloading
 */

package oopsdemo3;

public class OutletManagement {

    public static void main(String[] args)
    {
        Outlet outlet=new Outlet();
        System.out.println("---------------------------------------------");
        //Add Product with only Name & price
        outlet.addProduct("T-Shirt",20.50);
        outlet.addProduct("Full Sleeve Shirt",50.50);

        System.out.println("---------------------------------------------");
        //Add Product with only Name ,price, quantity
        outlet.addProduct("Jeans",45.50,100);
        outlet.addProduct("Shorts",25.50,50);

        System.out.println("---------------------------------------------");
        //Add Product with only Name , price, quantity, category
        outlet.addProduct("Sneakers",75.50,30,"Footwear");
        outlet.addProduct("Leather Shoes",175.50,30,"Footwear");
        System.out.println("---------------------------------------------");

    }

}
