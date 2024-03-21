package TP9.observator;

import java.util.ArrayList;

public class Input {
    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    private boolean mainState;

    public void subscribes(Subscriber s){
        this.subscribers.add(s);
    }
    public void unsubscribes(Subscriber s){
        this.subscribers.remove(s);
    }
    public void notifySubscriber(){
        for(Subscriber s:this.subscribers){
            s.notify();
        }
    }

}
