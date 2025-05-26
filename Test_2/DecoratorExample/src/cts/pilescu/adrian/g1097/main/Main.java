package cts.pilescu.adrian.g1097.main;

import cts.pilescu.adrian.g1097.models.Coffee;
import cts.pilescu.adrian.g1097.models.MilkDecorator;
import cts.pilescu.adrian.g1097.models.SimpleCoffee;
import cts.pilescu.adrian.g1097.models.SugarDecorator;

public class Main {
    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();

        Coffee sugarCoffee = new SugarDecorator(coffee);
        System.out.println(sugarCoffee.getDescription() + " costs " + sugarCoffee.getCost());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.getDescription() + " costs " + milkCoffee.getCost());

        Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(coffee));
        System.out.println(sugarMilkCoffee.getDescription() + " costs " + sugarMilkCoffee.getCost());

    }
}