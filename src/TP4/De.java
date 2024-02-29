package TP4;

public class De {
    public int nbrFace ;
    public De(){
        this.nbrFace = 6;
    }
    public int roll(){

        return (int)(Math.random() * (this.nbrFace+1));
    }
}
