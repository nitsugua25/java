package TP10.observator;

import java.util.ArrayList;
import java.util.List;

public class WeatherChannel {
    private ArrayList<Display> subscribers = new ArrayList<>();
    private ArrayList<ArrayList<Float>> data = new ArrayList<>();
    public void add(Display display){
        subscribers.add(display);
    }

    public void addData(float temperature,float humidite){
        ArrayList temp = new ArrayList<>();
        temp.add(temperature);
        temp.add(humidite);
        this.data.add(temp);
        this.notifi();
    }

    public void notifi(){
        for(Display i : this.subscribers){
            i.display(this.data);
        }

    }

}
