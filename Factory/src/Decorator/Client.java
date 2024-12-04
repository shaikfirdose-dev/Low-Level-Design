package Decorator;

public class Client {

    public static void main(String[] args) {
        BasePizza pizza = new Capsicum(new ExtraCheese(new VegPizza()));
        int pizzaPrice = pizza.cost();
        System.out.println(pizzaPrice);
    }
}
