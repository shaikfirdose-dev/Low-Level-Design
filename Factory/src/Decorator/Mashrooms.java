package Decorator;

public class Mashrooms extends ToppingDecoratorPizza{
    BasePizza basePizza;

    public Mashrooms(BasePizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+25;
    }
}
