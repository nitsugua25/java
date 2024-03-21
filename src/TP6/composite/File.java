package TP6.composite;

public class File implements Component{

    private String name = "";

    public File(String n){
        this.name = n;
    }


    @Override
    public String execute() {
        return this.name;
    }
}
