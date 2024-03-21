package TP8.strategy;

public class FormatMail implements Strategy{
    private String at = "@";

    @Override
    public boolean valid(String texte) {

        return texte.indexOf(this.at) != -1;
    }
}
