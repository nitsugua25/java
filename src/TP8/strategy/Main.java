package TP8.strategy;

public class Main {
    public static void main(String[] args) {
        String txt = "6";
        Validateur valInt = new Validateur(new FormatInt(),txt);
        Validateur valMail = new Validateur(new FormatMail(),txt);
        System.out.println("est ce que "+txt+" est un nombre : "+valInt.isValid());
        System.out.println("est ce que "+txt+ "est un mail : "+valMail.isValid());
        txt = "ugo@gmail.com";
        Validateur valInt2 = new Validateur(new FormatInt(),txt);
        Validateur valMail2 = new Validateur(new FormatMail(),txt);
        System.out.println("est ce que "+txt+" est un nombre : "+valInt2.isValid());
        System.out.println("est ce que "+txt+" est un mail : "+valMail2.isValid());
    }

}
