package Decorator;

public class ExtraCheese extends ToppingDecoratorPizza{
    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
