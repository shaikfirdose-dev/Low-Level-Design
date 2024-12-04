package Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{

    List<Observer> observers = new ArrayList<>();
    String title;

    @Override
    public void subscribeChannel(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeChannel(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifySubscriber() {
        for(Observer ob : observers){
            ob.update();
        }
    }

    @Override
    public void update() {
        System.out.println("video uploaded");
        notifySubscriber();
    }
}
