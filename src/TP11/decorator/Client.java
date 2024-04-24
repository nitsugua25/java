package TP11.decorator;

public class Client {

    public static void main(String[] args) {


        Pizza classicPizza = new Meatball(new Cheese(new ClassicPizza()));

        System.out.println("Ingredient : "+classicPizza.getDescription());

        System.out.println("Price : "+classicPizza.getCost());

    }
}
