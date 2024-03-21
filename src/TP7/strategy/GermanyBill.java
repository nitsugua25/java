package TP7.strategy;

public class GermanyBill implements Strategy{

    private double priceBill ;
    private String currency = "€";

    public GermanyBill(double price){
        this.priceBill = price;
    }
    @Override
    public String billing() {
        String bill = "Der Rechungsbetrag ist : "+this.priceBill + this.currency;
        return bill;
    }
}
