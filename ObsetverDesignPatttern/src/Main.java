import ObeserverDP.Investor;
import ObeserverDP.Observer;
import ObeserverDP.StockMarket;
import ObeserverDP.Subject;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();


        Observer investor1 = new Investor("Shaik");
        Observer investor2 = new Investor("Firdose");

        stockMarket.registerObserver(investor1);
        stockMarket.registerObserver(investor2);

        stockMarket.setStockPrice(200.5f);
    }
}