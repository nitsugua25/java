package TP7.strategy;

public class EnglandBill implements Strategy{
    private double priceBill ;
    private String currency = "£";

    public EnglandBill(double price){
        this.priceBill = price;
    }
    @Override
    public String billing() {
        String bill = "The amount of the invoice is : "+this.priceBill + this.currency;
        return bill;
    }
}
