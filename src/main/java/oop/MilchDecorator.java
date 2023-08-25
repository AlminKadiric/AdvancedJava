package oop;

public class MilchDecorator extends Beverage{
    private Beverage beverage;
    protected MilchDecorator(Beverage beverage) {
        super("espresso s mlijekom");
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }

    @Override
    public void drink() {
        System.out.println(beverage.getName() + " s mlijekom pijem.");

    }
}
