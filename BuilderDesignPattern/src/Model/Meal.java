package Model;

public class Meal {
    private String burger;
    private String sauce;
    private String fries;
    private String drink;
    private String dessert;


    public String getBurger() {
        return burger;
    }

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getFries() {
        return fries;
    }

    public void setFries(String fries) {
        this.fries = fries;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "burger='" + burger + '\'' +
                ", sauce='" + sauce + '\'' +
                ", fries='" + fries + '\'' +
                ", drink='" + drink + '\'' +
                ", dessert='" + dessert + '\'' +
                '}';
    }
}
