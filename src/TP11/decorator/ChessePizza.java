package TP11.decorator;

public class ChessePizza implements Pizza{

    @Override
    public String getDescription() {
        return "A pizza with chesse";
    }

    @Override
    public double getCost() {
        return 9.0;
    }
}
