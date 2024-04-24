package TP11.decorator;

public class Tuna extends ToppingDecorator{

    public Tuna(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding dough");

        System.out.println("Adding Tuna");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ",Tuna";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.50;
    }
}