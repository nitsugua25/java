package TP9.observator;

public class ConvOctale implements Subscriber{
    @Override
    public String update(int context) {
        String octale = Integer.toOctalString(context);
        return octale;
    }
}
