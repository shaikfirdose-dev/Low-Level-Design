package Observer;

public interface Subject {

    void subscribeChannel(Observer observer);
    void unSubscribeChannel(Observer observer);
    void notifySubscriber();
    void update();
}
