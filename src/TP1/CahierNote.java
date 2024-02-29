package TP1;

public class CahierNote {
    private String cour = "INDEFINI";
    public CahierNote(){
        this.cour = "TRT2";
    }
    public CahierNote(String cour){
        this.cour = cour;
    }
    public void setNomCour(String nomCour){
        this.cour = nomCour;
    }

    public String getNomCour(){
        return this.cour;
    }
    public void afficheMessage(){
        System.out.println("Bienvenue au cahier de notes! \nCours de "+ getNomCour());
    }

}
