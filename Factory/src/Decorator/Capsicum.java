package Decorator;

public class Capsicum extends ToppingDecoratorPizza{
    BasePizza basePizza;

    public Capsicum(BasePizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+15;
    }
}
