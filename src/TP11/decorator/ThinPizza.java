package TP11.decorator;

public class ThinPizza implements Pizza{

    @Override
    public String getDescription() {
        return "A pizza with thin crust";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
