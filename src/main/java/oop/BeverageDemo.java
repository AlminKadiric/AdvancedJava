package oop;

import oop.Espresso;
import oop.MilchDecorator;
import oop.Tea;

public class BeverageDemo {
    public static void main(String[] args) {
        Espresso espresso = new Espresso("Espresso");
        espresso.drink();
        espresso.print();
        MilchDecorator milchDecorator = new MilchDecorator(espresso);
        milchDecorator.drink();
        milchDecorator.print();

        Tea tea = new Tea("Tea");
        tea.drink();
        tea.print();

        MilchDecorator milchDecorator1 = new MilchDecorator(tea);
        milchDecorator1.drink();
        milchDecorator1.print();



    }
}
