package oop;

public class CocaCola extends Beverage{
    protected CocaCola(String name) {
        super("Coca Cola");
    }

    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public void drink() {
        System.out.println("Coca Cola se pije ljeti.");

    }
}
