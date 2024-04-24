package TP11.decorator;

public class Meatball extends ToppingDecorator{

    public Meatball(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding dough");

        System.out.println("Adding Meatball");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ",Meatball";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.50;
    }
}
