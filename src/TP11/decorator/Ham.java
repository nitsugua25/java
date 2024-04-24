package TP11.decorator;

public class Ham extends ToppingDecorator{

    public Ham(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding dough");

        System.out.println("Adding Ham");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ",Ham";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.50;
    }
}