package TP5;

import java.util.ArrayList;

public class Ville implements Component{
    private ArrayList<Component> children = new ArrayList<Component>();


    public void addChildren(Component child){
        this.children.add(child);
    }
    public void removeChildren(Component child){
        this.children.remove(child);
    }

    public ArrayList<Component> getChildren(){
        return this.children;
    }
    @Override
    public double execute() {
        double temp = 0;
        for(Component child:this.children){
            temp += child.execute();
        }
        return temp;
    }
}
