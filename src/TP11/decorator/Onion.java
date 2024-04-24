package TP11.decorator;

public class Onion extends ToppingDecorator{

    public Onion(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding dough");

        System.out.println("Adding Onion");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ",Onion";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.50;
    }
}
