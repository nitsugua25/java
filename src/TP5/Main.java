package TP5;

public class Main {
    public static void main(String[] args) {
        Component ville1 = new Ville(150);
        Component ville2 = new Ville(260);
        Province province1 = new Province();
        province1.addChildren(ville1);
        province1.addChildren(ville2);
        System.out.println(province1.execute());
        System.out.println(ville1.execute());

    }
}
