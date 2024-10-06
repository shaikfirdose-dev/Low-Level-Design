package ObeserverDP;

public class Investor implements Observer{
    private String name;
    private float stockPrice;

    public Investor(String name){
        this.name = name;
    }
    @Override
    public void update(float stockPrice) {
        this.stockPrice = stockPrice;
        System.out.println(name+" has been notify that stock price is updated"+ stockPrice);
    }
}
