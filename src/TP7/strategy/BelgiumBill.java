package TP7.strategy;

public class BelgiumBill implements Strategy{

    private double priceBill ;
    private String currency = "€";

    public BelgiumBill(double price){
        this.priceBill = price;
    }
    @Override
    public String billing() {
        String bill = "Le montant de la facture est de : "+this.priceBill + this.currency;
        return bill;
    }
}
