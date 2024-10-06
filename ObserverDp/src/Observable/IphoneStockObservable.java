package Observable;
import Observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{
    private List<StockObserver> observers;
    private boolean stockAvailable;

    public IphoneStockObservable(){
        observers = new ArrayList<>();
    }
    @Override
    public void add(StockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(StockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(StockObserver observer : observers){
            observer.update();
        }
    }

    public void setStockAvailable(boolean stock)
    {
        if(stock){
            this.stockAvailable = true;
            notifyObserver();
        }
    }
}
