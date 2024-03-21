package TP5;

public class Main {
    public static void main(String[] args) {
        Ville ville1 = new Ville();
        Component magasin1 = new Magasin(150);
        Component magasin2 = new Magasin(250);
        Component magasin3 = new Magasin(350);
        Province province1 = new Province();
        province1.addChildren(ville1);
        province1.addChildren(magasin3);
        ville1.addChildren(magasin1);
        ville1.addChildren(magasin2);

        System.out.println(province1.execute());
        System.out.println(ville1.execute());

    }
}
