package oop;

public class BosnianCaffe extends Beverage{
    protected BosnianCaffe(String name) {
        super("BosnianCaffe");
    }

    @Override
    public double cost() {
        return 2.3;
    }

    @Override
    public void drink() {
        System.out.println("Bosnian Caffe se cejfi");


    }
}
