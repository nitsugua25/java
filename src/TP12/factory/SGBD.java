package TP12.factory;

import java.util.ArrayList;

public class SGBD {

    private ArrayList<Login> login = new ArrayList<Login>();

    public void createLogin(String type){
        if (type.equals("S")){
            Login sqllogin = new LoginSQL();
            this.login.add(sqllogin);
        }
        else if (type.equals("O")) {
            Login oraclelogin = new LoginOracle();
            this.login.add(oraclelogin);
        }

    }

    public void addLogin(Login login){
        this.login.add(login);
    }
    public void showLogin(){
        for (Login i:this.login){
            i.makeConnection();
        }
    }
}
