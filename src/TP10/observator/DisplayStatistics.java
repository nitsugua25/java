package TP10.observator;
import java.util.Collections;
import java.util.ArrayList;

public class DisplayStatistics implements Display{
    @Override
    public void display(ArrayList<ArrayList<Float>> data) {
        ArrayList<Float> temp = new ArrayList<>();
        for(ArrayList<Float> i: data){
            temp.add(i.get(0));
        }
        float sum = 0;
        for(Float i: temp){
            sum += i;
        }
        float avg = sum/temp.size();
        System.out.println(" Températures min/moy/max : "+Collections.min(temp)+"°C/ "+avg+"°C/ "+Collections.max(temp)+"°C");

    }
}
