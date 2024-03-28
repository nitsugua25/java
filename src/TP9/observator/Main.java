package TP9.observator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        ConvBin convB = new ConvBin();
        ConvOctale convO = new ConvOctale();
        ConvHex convH = new ConvHex();
        input.subscribes(convB);
        input.subscribes(convH);
        input.subscribes(convO);
        Scanner sc =new Scanner(System.in);

        while (true){
            System.out.println("Saisir un entier :");
            input.notifySubscriber(sc.nextInt());


        }
    }
}
