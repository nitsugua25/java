package TP2;

public class CompteBancaire{
    private double solde;

    public CompteBancaire(double valeurDepart){
        if (valeurDepart<0){
            this.solde = 0;
        }
        else {
            this.solde = valeurDepart;
        }
    }

    public void depot(double depot){
        this.solde = this.solde + depot;
    }
    public double getSolde() {
        return this.solde;
    }
}
