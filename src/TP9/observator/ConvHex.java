package TP9.observator;

public class ConvHex implements Subscriber{
    @Override
    public String update(int context) {
        String hex = Integer.toHexString(context);
        return hex;
    }
}
