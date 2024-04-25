package TP12.factory;

public class Client {
    public static void main(String[] args) {

        SGBD sgbd = new SGBD();

        sgbd.createLogin("S");
        sgbd.createLogin("O");
        sgbd.createLogin("S");
        sgbd.showLogin();
    }
}
