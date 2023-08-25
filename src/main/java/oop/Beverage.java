package oop;

public abstract  class Beverage implements Drinkable {
    private  final String name;
    public  abstract double cost();


    protected Beverage(String name) {
        this.name = name;

        }

    public String getName() {
        return name;
    }
    public void print(){
        drink();
        System.out.println(getName() +  " kosta " + cost());
    }

}
