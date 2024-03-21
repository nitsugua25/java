package TP6.composite;

import java.util.ArrayList;

public class Directory implements Component {

    private String name = "";
    private ArrayList<Component> children = new ArrayList<>();

    public Directory(String n){
        this.name = n;
    }

    public void add(Component child){
        this.children.add(child);
    }
    public void remove(Component child){
        this.children.remove(child);
    }


    @Override
    public String execute() {
        String temp = "";
        if (this.children.isEmpty()){
            temp = this.name + "/";
        }
        else {
            for(Component child:this.children){
                temp = temp + this.name+ "/" + child.execute();;
            }
        }
        temp += "\n";
        return temp;
    }
}
