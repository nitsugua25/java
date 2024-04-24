package TP11.decorator;

public class Cheese extends ToppingDecorator{

    public Cheese(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding dough");

        System.out.println("Adding Cheese");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ",Cheese";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.50;
    }
}
