package oopsdemo3;

public class Book extends Item {

    private String author;

    public Book(String name, int price,String author) {
        super(name, price);
        this.author=author;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Author :"+author);
    }
}
