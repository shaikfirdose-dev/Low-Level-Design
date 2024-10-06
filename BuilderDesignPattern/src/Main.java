//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MealsBuilder mealsBuilder1 = new VegMealBuilder();
        MealsBuilder mealsBuilder2 = new NonVegMealBuilder();

        Director director1 = new Director(mealsBuilder1);
        Director director2 = new Director(mealsBuilder2);

        director1.prepareMeals();
        director2.prepareMeals();

        System.out.println(director1.getMeal());
        System.out.println(director2.getMeal());

    }
}