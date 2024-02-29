package TP4;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String args[]){
        De de = new De();
        Carte deckDeCarte = new Carte();
        ArrayList liste = new ArrayList();
        liste.add(de);
        liste.add(deckDeCarte);
        for(Object obj : liste){
            if(obj instanceof De){
                System.out.println(de.roll());
            }
            else if(obj instanceof Carte){
                deckDeCarte.melange();
                deckDeCarte.afficher();
            }
        }

    }
}
