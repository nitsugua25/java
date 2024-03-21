package TP7.strategy;

public class Main {
    public static void main(String[] args) {
        Context maFacture=new Context();

        System.out.println("Par défaut (Belgique)");
        System.out.println("---------------------");
        System.out.println(maFacture.execute());
        maFacture.setStrategy(new GermanyBill(25));
        System.out.println("\nAllemagne");
        System.out.println("----------");
        System.out.println(maFacture.execute());
        maFacture.setStrategy(new EnglandBill(60));
        System.out.println("\nRoyaume-Uni");
        System.out.println("----------");
        System.out.println(maFacture.execute());

    }
}
