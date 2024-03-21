package TP8.strategy;

public class Validateur {
    private Strategy strategy ;
    private String text;
    public Validateur(Strategy strat ,String txt){
        this.strategy = strat;
        this.text = txt;
    }
    public boolean isValid(){
        return this.strategy.valid(this.text);
    }
}
