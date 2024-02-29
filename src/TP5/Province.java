package TP5;
import java.util.ArrayList;
import java.util.List;

public class Province implements Component{
    private String name;
    private final List children = new ArrayList();

    @Override
    public double getBenefit(){
        double sum = 0;
        for(Object child : children){
            if (child instanceof Component){
                sum = sum + ((Component) child).getBenefit();
            }
        }
        return sum;
    }
}
