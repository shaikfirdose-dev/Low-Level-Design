package ObeserverDP;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject{

    private List<Observer> observers;
    private float stockPrice;

    public StockMarket(){
        observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setStockPrice(float stockPrice){
        this.stockPrice = stockPrice;
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(stockPrice);
        }
    }
}
