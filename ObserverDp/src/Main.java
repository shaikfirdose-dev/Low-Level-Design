import Observable.IphoneStockObservable;
import Observable.StockObservable;
import Observer.EmailNotificationAlertObserver;
import Observer.MobileNotificationAlertObserver;
import Observer.StockObserver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservable();

        StockObserver observer1 = new EmailNotificationAlertObserver("123@gmail.com", iphoneStockObservable);
        StockObserver observer2 = new EmailNotificationAlertObserver("123@gmail.com", iphoneStockObservable);
        StockObserver observer3 = new MobileNotificationAlertObserver("Stock available", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockAvailable(true);
    }
}