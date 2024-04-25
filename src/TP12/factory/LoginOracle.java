package TP12.factory;

public class LoginOracle implements Login{

    @Override
    public void makeConnection() {
        System.out.println("Making a oracle connection");
    }
}
