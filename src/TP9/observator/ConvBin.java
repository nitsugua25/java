package TP9.observator;

public class ConvBin implements Subscriber{

    @Override
    public String update(int context) {
        String binaire = Integer.toBinaryString(context);
        return binaire;
    }
}
