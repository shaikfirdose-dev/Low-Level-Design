import Model.Meal;

public class Director {

    MealsBuilder mealsBuilder;

    Director(MealsBuilder meals){
        mealsBuilder = meals;
    }

    public void prepareMeals(){
        mealsBuilder.addBurger();
        mealsBuilder.addFries();
        mealsBuilder.addFries();
        mealsBuilder.addDrink();
        mealsBuilder.addDessert();
    }

    public Meal getMeal(){
        return mealsBuilder.buildMeal();
    }
}
