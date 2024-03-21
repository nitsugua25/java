package TP5;

public class Magasin implements Component {

    private double benefice;

    public Magasin(double benef) {
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
