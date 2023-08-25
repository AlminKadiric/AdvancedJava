package oop;

public class Tea extends Beverage{
    protected Tea(String name) {
        super("Tea");
    }

    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public void drink() {
        System.out.println("Ocajavam");

    }
}
