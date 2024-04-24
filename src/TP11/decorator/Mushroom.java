package TP11.decorator;

public class Mushroom extends ToppingDecorator{

    public Mushroom(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding dough");

        System.out.println("Adding Mushroom");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ",Mushroom";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.50;
    }
}
