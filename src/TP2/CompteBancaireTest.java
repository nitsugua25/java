package TP2;

public class CompteBancaireTest {
    public static void main(String[] args){
        CompteBancaire compte1 = new CompteBancaire(50);
        CompteBancaire compte2 = new CompteBancaire(-7.5);

        System.out.println(compte1.getSolde());
        System.out.println(compte2.getSolde());

        compte1.depot(10);

        System.out.println(compte1.getSolde());
        System.out.println(compte2.getSolde());

        compte2.depot(5);

        System.out.println(compte1.getSolde());
        System.out.println(compte2.getSolde());

    }
}
