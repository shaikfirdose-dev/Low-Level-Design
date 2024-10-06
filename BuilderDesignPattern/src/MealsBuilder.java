import Model.Meal;

public interface MealsBuilder {
    void addBurger();
    void addSauce();
    void addDrink();
    void addFries();
    void addDessert();

    Meal buildMeal();
}
