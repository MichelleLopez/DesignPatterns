
public class Builder {

    public static void main(String[] args) {
        MealBuilder MealBuilder = new SandwichMealBuilder();
        MealDirector MealDirector = new MealDirector();
        MealDirector.makeMeal(MealBuilder);
        Meal Meal = MealBuilder.getMeal();
        System.out.println(Meal.toString());
    }
    
}
