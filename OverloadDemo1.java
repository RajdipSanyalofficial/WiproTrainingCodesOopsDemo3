package oopsdemo3;

public class OverloadDemo1 {
    public static void main(String[] args) {

        Addition addition = new Addition();

        //Invoke Overload Add() method
        addition.add();
        addition.add(450,620);
        addition.add(30.50f,20.50f); // Type promotion --> Float --> Double
        addition.add(3000.50,500);
        addition.add(80,75,200);
        addition.add("Hello","World");

    }
}
