package TP12.factory;

public class LoginSQL implements Login{
    @Override
    public void makeConnection() {
        System.out.println("Making a SQL connection");

    }
}
