package oopsdemo3;

public class Laptop extends Item {

    private String manufacturer;

    public Laptop(String name, int price,String manufacturer) {
        super(name, price);
        this.manufacturer=manufacturer;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Manufacturer :"+manufacturer);
    }
}
