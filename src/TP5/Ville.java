package TP5;

public class Ville implements Component{

    private double benefice;

    public Ville(double benef) {
        setBenefice(benef);
    }


    public void setBenefice(double benef){
        this.benefice = benef;
    }
    @Override
    public double execute(){
        return this.benefice;
    }
}
