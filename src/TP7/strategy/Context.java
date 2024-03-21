package TP7.strategy;

public class Context {
    private Strategy strategy = new BelgiumBill(50);

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String execute(){
        return this.strategy.billing();
    }
}
