import Model.Meal;

public class VegMealBuilder implements MealsBuilder{
    private Meal meal;
    VegMealBuilder(){
        meal = new Meal();
    }
    @Override
    public void addBurger() {
        this.meal.setBurger("Veg Burger");
    }

    @Override
    public void addSauce() {
        this.meal.setSauce("Sauce added");
    }

    @Override
    public void addDrink() {
        this.meal.setDrink("Drink added");
    }

    @Override
    public void addFries() {
        this.meal.setFries("Fries added");
    }

    @Override
    public void addDessert() {
        this.meal.setDessert("Dessert added");
    }

    @Override
    public Meal buildMeal() {
        return meal;
    }
}
