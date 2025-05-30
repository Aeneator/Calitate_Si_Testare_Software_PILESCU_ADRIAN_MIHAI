package cts.pilescu.adrian.g1097.models;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

}
