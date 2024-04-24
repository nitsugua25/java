package TP11.decorator;

public class ClassicPizza implements Pizza{

    @Override
    public String getDescription() {
        return "A classic pizza";
    }

    @Override
    public double getCost() {
        return 8.0;
    }
}
