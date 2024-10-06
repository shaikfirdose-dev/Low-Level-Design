package Observable;
import Observer.StockObserver;

public interface StockObservable {
    void add(StockObserver observer);
    void remove(StockObserver observer);
    public void setStockAvailable(boolean stock);
    void notifyObserver();
}
