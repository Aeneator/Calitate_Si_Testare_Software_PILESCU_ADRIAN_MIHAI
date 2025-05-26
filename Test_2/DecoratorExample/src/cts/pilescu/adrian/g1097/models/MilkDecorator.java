package cts.pilescu.adrian.g1097.models;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    public double getCost() {
        return super.getCost() + 1.0;
    }

    public void gotMilk(){
        System.out.println("Got milk?");
    }
}
