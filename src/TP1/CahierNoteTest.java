package TP1;

import java.util.Scanner;

public class CahierNoteTest {
    //  attributs
    public static void main(String[] args){

        // cree et recupere l'input
        String nomCour;
        Scanner nom = new Scanner(System.in);

        //creation de mon objet
        CahierNote monCahier = new CahierNote();
        CahierNote monCahierIRT = new CahierNote("JAVA");

        //affiche message
        monCahier.afficheMessage();
        monCahierIRT.afficheMessage();
        //input
        System.out.print("Entrez le nom du cour : ");

        // change l'attribut nom cour
        monCahier.setNomCour(nom.nextLine());

        //réaffiche le message avec l'attribut modifié
        monCahier.afficheMessage();
        monCahierIRT.afficheMessage();

    }
}
