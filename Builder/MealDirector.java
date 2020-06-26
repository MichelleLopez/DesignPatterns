
public class MealDirector {
    
    public void makeMeal(MealBuilder mealBuilder) {
        mealBuilder.addSandwich("Pollo teriyaki");
        mealBuilder.addSides("Papas fritas");
        mealBuilder.addDrink("Coca-cola");
        mealBuilder.addOffer("none");
        mealBuilder.addPrice(150);
    }
}
