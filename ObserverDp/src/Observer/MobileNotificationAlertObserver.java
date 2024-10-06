package Observer;

import Observable.StockObservable;

public class MobileNotificationAlertObserver implements StockObserver{
    String msg;
    StockObservable observable;

    public MobileNotificationAlertObserver(String msg, StockObservable observable){
        this.msg = msg;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessage(msg);
    }

    public void sendMessage(String msg){
        System.out.println("Msg send to "+ msg);
    }
}
