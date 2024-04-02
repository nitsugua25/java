package TP10.observator;

import java.util.ArrayList;

public class DisplayCondition implements Display{
    @Override
    public void display(ArrayList<ArrayList<Float>> data) {
        ArrayList<Float> temp = data.get( (data.size()-1));
        System.out.printf("Température : "+temp.get(0)+"°c - Humidité : "+temp.get(1)+ ">>");

    }
}
