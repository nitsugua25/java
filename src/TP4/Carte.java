package TP4;

public class Carte {
    private int[] deck = new int[52];
    private String[] symbole = {"Pique","Coeur","Trefle","Carreau"};
    private String[] nombre = {"AS","2","3","4","5","6","7","8","9","10","Valet","Dame","Roi"};

    public Carte(){
        for (int i=0;i<this.deck.length;i++) {
            this.deck[i] = i;
        }
    }

    public void melange(){
        for(int i=0 ;i<this.deck.length;i++){
            int index = (int)(Math.random()*this.deck.length);
            int temp = this.deck[i];
            this.deck[i] = deck[index];
            this.deck[index] = temp;
        }
    }
    public void afficher(){
        for(int i=0;i<this.deck.length;i++){
            String symbole = this.symbole[this.deck[i]/13];
            String nombre = this.nombre[this.deck[i]%13];
            System.out.println(nombre +" de "+ symbole);

        }
    }
}
