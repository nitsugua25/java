package TP11.decorator;

public class BlackOlive extends ToppingDecorator{

    public BlackOlive(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding dough");

        System.out.println("Adding BlackOlive");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ",BlackOlive";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.50;
    }
}