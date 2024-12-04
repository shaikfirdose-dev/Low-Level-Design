package Composite;

public class Leaf implements Component{
    String name;
    String prices;
    public Leaf(String name, String prices){
        this.name = name;
        this.prices = prices;
    }
    @Override
    public void showPrices() {
        System.out.println(name+":"+prices);
    }
}
