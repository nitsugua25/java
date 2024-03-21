package TP8.strategy;

public class FormatInt implements Strategy{

    @Override
    public boolean valid(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
