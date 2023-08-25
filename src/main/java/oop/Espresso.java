package oop;

public class Espresso extends  Beverage{
    protected Espresso(String name) {
        super("Espresso");
    }

    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public void drink() {
        System.out.println("Espresso se pije ujutro!");

    }
}
